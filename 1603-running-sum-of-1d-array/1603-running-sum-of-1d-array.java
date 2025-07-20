class Solution {
    public int[] runningSum(int[] nums) {
        int []arr=new int[nums.length];
            int calc =0;
        for(int i=0; i<nums.length; i++){
            arr[i]=nums[i]+calc;
            calc=arr[i];
        }
        return arr;
    }
}