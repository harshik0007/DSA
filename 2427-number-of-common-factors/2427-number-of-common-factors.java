class Solution {
    public int commonFactors(int a, int b) {
        int count = 1;
        int common = 0;
        while(count <= Math.min(a, b)){
            if(a%count == 0 && b%count == 0){
                common++;
            }
            if(count == Math.min(a, b)/2){
                count = Math.min(a, b);
            }else{
                count++;
            }
        }
        return common;
    }
}