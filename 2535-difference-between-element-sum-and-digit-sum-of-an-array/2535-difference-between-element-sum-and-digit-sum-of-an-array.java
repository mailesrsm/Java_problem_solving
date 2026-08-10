class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        
        int digit;
        int digitsum=0;
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int temp=nums[i];
            while(temp>0){
                digit=temp%10;
                digitsum+=digit;
                temp=temp/10;
            }     
        }
        return Math.abs(sum-digitsum);
    }
}