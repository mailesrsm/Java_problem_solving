class Solution {
    public int smallestEvenMultiple(int n) {
        int a;
        if(n%2==0){
            a=n;
        }else{
            a=n*2;
        }
        return a;
    }
}