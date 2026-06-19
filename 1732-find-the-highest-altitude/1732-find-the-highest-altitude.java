class Solution {
    public int largestAltitude(int[] gain) {
        int alt=0;
        int high=0;
        for(int i=0;i<gain.length;i++){
            alt=alt+gain[i];
            if(alt>high){
                high=Math.abs(alt);
            }
            
        }
        return high;
    }
}