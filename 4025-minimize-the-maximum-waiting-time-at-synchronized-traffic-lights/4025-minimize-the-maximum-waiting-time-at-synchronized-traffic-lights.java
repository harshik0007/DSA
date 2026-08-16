class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int maxLight = Integer.MIN_VALUE;
        for(int i = 0; i < lights.length; i++){
            maxLight = Math.max(maxLight, lights[i]);
        }

        int min = 0;
        for(int i = 0; i < arrivalTime.length; i++){
            int r = arrivalTime[i] % period;
                if(r >= maxLight){
                    min = Math.max(min, (period-r));
                }
        }
        return min;
    }
}