class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int diff = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length-1; i++){
            diff = Math.min(Math.abs(arr[i]-arr[i+1]), diff);
        }

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        for(int i = 0; i < arr.length-1; i++){
            if(Math.abs(arr[i]-arr[i+1]) == diff){
                al = new ArrayList<>();
                al.add(arr[i]);
                al.add(arr[i+1]);
                ans.add(al);
            }
        }

        return ans;
    }
}