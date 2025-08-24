class Solution {
    public int threeSumClosest(int[] nums, int target) {
         Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2]; // Initialize with sum of first three elements

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate elements for the first number
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {
                int currentSum = nums[i] + nums[l] + nums[r];

                if (currentSum == target) {
                    return currentSum; // Found exact match, return immediately
                }

                // Update ans if current sum is closer to target
                if (Math.abs(currentSum - target) < Math.abs(ans - target)) {
                    ans = currentSum;
                }

                if (currentSum < target) {
                    l++; // Move left pointer to increase sum
                } else {
                    r--; // Move right pointer to decrease sum
                }
            }
        }
        return ans;
    }
}