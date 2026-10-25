class Solution {
    public int longestValidParentheses(String str) {
        Stack<Integer> s = new Stack<>();
        int max_v = 0;
        int index = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ')') {
                if (s.isEmpty()) {
                    index = i;
                } else {
                    s.pop();
                    if (!s.isEmpty()) {
                        max_v = Math.max(max_v, i - s.peek());
                    } else {
                        max_v = Math.max(max_v, i - index);
                    }
                }
            } else {
                s.push(i);
            }
        }
        return max_v;
    }
}