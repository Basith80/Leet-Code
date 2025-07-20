class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int []arr = new int[nums.length];
        for(int i=0; i<arr.length ;i++){
            int point = 0;
            for(int j=0; j<arr.length; j++){
                if(nums[i]>nums[j]){
                    point++;
                }
            }
            arr[i]=point;
        }
        return arr;
    }
}