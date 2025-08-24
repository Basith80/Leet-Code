class Solution {
    public int singleNumber(int[] nums) {
        int result = 0; // Initialize result to 0

        // XOR all numbers in the array
        for (int num : nums) {
            result = result ^ num; 
        }

        return result; // The remaining value is the single number
    }
}