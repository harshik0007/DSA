class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            boolean divide = true;
            int n = i;
            while (n > 0) {
                int last_d = n % 10;
                if (last_d == 0) {
                    divide = false;
                    break;
                }
                if ((i % last_d) != 0) {
                    divide = false;
                    break;
                }
                n = n / 10;
            }

            if (divide) {
                l.add(i);
            }
        }
        return l;
    }
}