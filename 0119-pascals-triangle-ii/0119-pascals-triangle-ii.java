class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> l1 = new ArrayList<>();
        if (rowIndex > 0) {
            l1.add(List.of(1));
        } else {
            return new ArrayList<>(List.of(1));
        }
        for (int i = 1; i <= rowIndex; i++) {
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
        return l1.get(rowIndex);
    }
}
