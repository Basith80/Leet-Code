class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0) return new int[]{-1,-1};

        int start = search(nums , target);
        if(  start == nums.length || nums[start] != target){
            return new int[] {-1,-1};
        }
        int end = search(nums, target +1) -1;
        return new int[]{start, end};
    }
    private static int search(int[] nums, int target){
        int s = 0;
        int e = nums.length; 
        while(s < e){
             int m = s +(e -s) / 2;
            if(nums[m] < target) s = m+1;
            else e = m ;
        }
        return s;
    }
}