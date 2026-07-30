class Solution {
    public boolean check(int[] nums) {
        int arr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        Arrays.sort(arr);

        if (Arrays.equals(arr, nums)) {
            return true;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int curr = arr[arr.length - 1];
            for (int j = arr.length - 2; j >= 0; j--) {
                arr[j + 1] = arr[j];
            }
            arr[0] = curr;
            if (Arrays.equals(arr, nums)) {
                return true;
            }
        }
        return false;
    }
}