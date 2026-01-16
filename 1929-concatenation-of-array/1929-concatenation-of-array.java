class Solution {
    public int[] getConcatenation(int[] nums) {
        int []arr = new int[2 * nums.length];
        int i=0;
        int j=0;
        while(i < arr.length){
            arr[i++] = nums[j++];
            if(j==nums.length){
                j=0;
            }
        }
        return arr;
    }
}