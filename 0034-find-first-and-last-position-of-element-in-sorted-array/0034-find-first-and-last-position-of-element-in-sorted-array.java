class Solution {
    public int[] searchRange(int[] nums, int target) {
       int start = firstGreaterEqual(nums, target);
        if (start == nums.length || nums[start] != target) {
            return new int[]{-1, -1};
        }
        int end = firstGreaterEqual(nums, target + 1) - 1;
        return new int[]{start, end};
    }

    private int firstGreaterEqual(int[] nums, int target) {
        int lo = 0, hi = nums.length;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] < target) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    } 
    }
