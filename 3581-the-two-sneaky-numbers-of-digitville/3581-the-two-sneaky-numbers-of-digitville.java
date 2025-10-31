class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        for(int i=0 ; i< nums.length-1 ; i++){
            for(int j = i+1; j < nums.length; j++)
            if(nums[i] > nums[j]){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }  
        int [] arr = new int[2];
        int in = 0;
        for(int i=0; i< nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                arr[in++] = nums[i];
                i++;
            }
        } 

        return arr;
    }
}