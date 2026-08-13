class Solution {
    public int mirrorDistance(int n) {
        StringBuilder s=new StringBuilder();
        int original=n;
        while(n>0){
            int digit=n%10;
            s.append(digit);
            n=n/10;
        }
        int rev=Integer.parseInt(s.toString());
        int diff=rev-original;
        return Math.abs(diff);
    }
}