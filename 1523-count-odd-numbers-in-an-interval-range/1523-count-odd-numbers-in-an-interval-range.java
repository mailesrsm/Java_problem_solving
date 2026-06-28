class Solution {
    public int countOdds(int low, int high) {
        int total=(high-low)+1;
        int count=total/2;
        if((high-low+1)%2!=0 && low%2!=0){
            count++;
        }
        
        return count;
    }
}