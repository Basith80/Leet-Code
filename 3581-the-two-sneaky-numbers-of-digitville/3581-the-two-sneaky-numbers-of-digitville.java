class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] arr = new int[2];
        int in = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == nums[j] && i != j) {
                    arr[in++] = nums[j];
                    break;
                }
            }
        }
        Arrays.sort(arr);
        return arr;
    }
}