class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int ranges[] = new int[drones.length];
        int x2 = target[0];
        int y2 = target[1];
        for(int i = 0; i < drones.length; i++){
            int x1 = drones[i][0];
            int y1 = drones[i][1];

            int d_range = Math.abs(x1-x2) + Math.abs(y1-y2);
            if(d_range <= drones[i][2]){
                ranges[i] = d_range;
            } else {
                ranges[i] = d_range;
            }
        }

        int min = Integer.MAX_VALUE;
        int index = -1;
        for(int i = 0; i < ranges.length; i++){
            if(min > ranges[i] && ranges[i] <= drones[i][2]){
                min = ranges[i];
                index = i;
            }

            if(min == ranges[i]){
                index = Math.min(index, i);
            }
        }
        return index;
    }
}