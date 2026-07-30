class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l1 = new ArrayList<>();
        if (numRows > 1) {
            l1.add(List.of(1));
            l1.add(List.of(1, 1));
        } else {
            l1.add(List.of(1));
        }
        for (int i = 2; i < numRows; i++) {
            List<Integer> l = new ArrayList<>();
            for (int r = 0; r <= i; r++) {
                if (r == 0 || r == i) {
                    l.add(1);
                } else {
                    int ans = (l1.get(i - 1).get(r - 1)) + (l1.get(i - 1).get(r));
                    l.add(ans);
                }
            }
            l1.add(l);
        }
        return l1;
    }
}