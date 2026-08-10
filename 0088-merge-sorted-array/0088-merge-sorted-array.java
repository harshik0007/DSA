class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int low = m;
        int high = 0;
        while(high < nums2.length){
            nums1[low] = nums2[high];
            low++;
            high++;
        }

        Arrays.sort(nums1);
    }
}