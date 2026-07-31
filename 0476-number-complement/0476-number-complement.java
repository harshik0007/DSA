class Solution {
    public int findComplement(int num) {
        int comple = 0;
        int count = 0;
        while(num > 0){
            int last_bit = (num & 1);
            last_bit = last_bit ^ 1;
            comple = comple + last_bit * (int)Math.pow(2, count);
            count++;
            num = num >> 1;
        }
        return comple;
    }
}