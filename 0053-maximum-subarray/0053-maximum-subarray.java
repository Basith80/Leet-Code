class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for(int ele: nums){
            sum+=ele;
            max = Math.max(sum , max);
            if (sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}