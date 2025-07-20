class Solution {
    public int[] getConcatenation(int[] nums) {
        int []arr = new int[nums.length*2];
        int index=0;
            for(int i=0; i<arr.length; i++){
            if(index<=nums.length-1){
                    arr[i]=nums[index];
                }
                else if(index>nums.length-1){
                    arr[i]=nums[index-(nums.length)];
                }
                index++;
            }
            return arr;
    }
}