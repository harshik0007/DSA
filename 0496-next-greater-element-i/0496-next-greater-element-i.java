class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++){
            int j = 0;
            int is_found = -1;

            while(nums1[i] != nums2[j]){
                j++;
            }

            while(j < nums2.length){
                if(nums2[j] > nums1[i]){
                    is_found = nums2[j];
                    break;
                }
                j++;
            }

            ans[i] = is_found;

        }

        return ans;
    }
}