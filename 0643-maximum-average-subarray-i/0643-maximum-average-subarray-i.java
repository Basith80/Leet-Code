class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int e = k;
        int s =0;
        double max = Integer.MIN_VALUE;
        double sum = 0;
        for(int i=0; i<k; i++){
        sum+=nums[i];
        }
        max = Math.max(max , sum/k);
        while(e<nums.length){
            sum -=nums[s++];
            sum+=nums[e++];
        max = Math.max(max , sum/k);
        }
        return max;
    }
}