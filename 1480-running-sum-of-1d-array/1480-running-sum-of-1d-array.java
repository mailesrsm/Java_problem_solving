class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int k=0;
        for(int i=0;i<n;i++){
            if(i>0){
                nums[k]=nums[i]+nums[k-1];
                k++;             
            }
            else{
            nums[k]=nums[i];
            k++;
            }
            
        }
        return nums;
    }
}