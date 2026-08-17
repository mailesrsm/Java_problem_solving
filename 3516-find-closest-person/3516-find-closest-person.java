class Solution {
    public int findClosest(int x, int y, int z) {
        int a;
        int p1=Math.abs(x-z);
        int p2=Math.abs(y-z);
        if(p1<p2){
             a=1;
        }else if(p2<p1){
             a=2;
        }else{
            a=0;
        }
        return a;
    }
}