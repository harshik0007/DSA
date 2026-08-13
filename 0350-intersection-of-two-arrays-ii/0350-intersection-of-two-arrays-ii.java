class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> l = new ArrayList<>();
        int array1[] = new int[1001];
        int array2[] = new int[1001];

        for(int i = 0; i < Math.max(nums1.length, nums2.length); i++){
            if(i < nums1.length){
                array1[nums1[i]]++;
            }

            if(i < nums2.length){
                array2[nums2[i]]++;
            }
        }

        for(int i = 0; i < array2.length; i++){
            if(array1[i] >= 1 && array2[i] >= 1 ){
                while(array1[i] > 0 && array2[i] > 0){
                    l.add(i);
                    array1[i]--;
                    array2[i]--;
                }
            }
        }

        return l.stream().mapToInt(Integer::intValue).toArray();
    }
}