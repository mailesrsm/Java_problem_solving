class Solution {
    public boolean checkDivisibility(int n) {
        int original=n;
        int sum=0;
        int prd=1;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            prd*=digit;
            n/=10;
        }
        return original%(sum+prd)==0;
    
    }
}