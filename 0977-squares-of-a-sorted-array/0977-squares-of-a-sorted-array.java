class Solution {
    public int[] sortedSquares(int[] nums) {
        int squares[] = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            squares[i] = (int)Math.pow(nums[i], 2);
        }

        Arrays.sort(squares);
        return squares;
    }
}