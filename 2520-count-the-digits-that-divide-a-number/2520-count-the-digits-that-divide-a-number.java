class Solution {
    public int countDigits(int num) {
        int rem;
        int count=0;
        int original=num;
        while(num>0){
            rem=num%10;
            if(original%rem==0){
                count++;
            }
            num=num/10;
        }
        return count;
    }
}