class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0; 
        int j=n;
        int []arr = new int[nums.length];
        int in=0;
        while(j<nums.length){
            arr[in++]=nums[i++];
            arr[in++] = nums[j++];
        }
        return arr;
    }
}