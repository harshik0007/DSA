class Solution {
    public boolean isValid(String s) {
        if (s.length() == 1) {
            return false;
        }
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.add(s.charAt(i));
            } else {
                if (!st.isEmpty()) {
                    if (s.charAt(i) == ')' && st.peek() == '(') {
                        st.pop();
                    } else if (s.charAt(i) == '}' && st.peek() == '{') {
                        st.pop();
                    } else if (s.charAt(i) == ']' && st.peek() == '[') {
                        st.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        if (st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}