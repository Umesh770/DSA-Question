class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0;
        int curr=0;
        int station=0;
        for(int j=0;j<cost.length;j++){
            total+=gas[j]-cost[j];
            curr+=gas[j]-cost[j];
            if(curr<0){
                station=j+1;
                curr=0;
            }
        }
        if(total<0){
            return -1;
        }
        return station;
    }
}