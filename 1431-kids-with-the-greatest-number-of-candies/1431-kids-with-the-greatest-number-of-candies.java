class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> al = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            int ithKid = candies[i] + extraCandies;
            boolean is_great = true;
            for (int j = i - 1; j >= 0; j--) {
                if (candies[j] > ithKid) {
                    al.add(false);
                    is_great = false;
                    break;
                }
            }

            if (is_great) {
                for (int j = i + 1; j < candies.length; j++) {
                    if (candies[j] > ithKid) {
                        al.add(false);
                        is_great = false;
                        break;
                    }
                }
            }

            if (is_great) {
                al.add(true);
            }

        }
        return al;
    }
}