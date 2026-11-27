class Solution {
    public int commonFactors(int a, int b) {
        int count = 1;
        int common = 0;
        while(count <= Math.max(a, b)){
            if(a%count == 0 && b%count == 0){
                common++;
            }
            count++;
        }
        return common;
    }
}