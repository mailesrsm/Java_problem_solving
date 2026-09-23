class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int total = 0;

        for (int num : nums) {
            total += num;
        }

        int target = total - x;

        if (target < 0) {
            return -1;
        }

        if (target == 0) {
            return n;
        }

        int left = 0;
        int currentSum = 0;
        int maxLength = -1;

        for (int right = 0; right < n; right++) {
            currentSum += nums[right];

            while (currentSum > target) {
                currentSum -= nums[left];
                left++;
            }

            if (currentSum == target) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
        }

        return maxLength == -1 ? -1 : n - maxLength;
    }
}