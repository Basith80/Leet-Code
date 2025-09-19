class Solution {
    public void moveZeroes(int[] nums) {
        int[] arr = new int[nums.length];
        int zeros =0;
        int ii =0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                arr[ii] = nums[i];
                ii++;
            } else {
                zeros++;
            }
        }
        for(int i= nums.length - zeros; i< nums.length; i++){
            arr[i] = 0;
        }
        int in = 0;
        for( int ele : arr){
            nums[in] = ele;
            in++;
        }
    }
}