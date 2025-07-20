class Solution {
    public int[] shuffle(int[] nums, int n) {
        int []arr = new int[nums.length];
        int i=0, j=n, index =0;
        while(j<nums.length){
            arr[index]=nums[i];
            arr[++index]=nums[j];
            index++; i++; j++;
        }
       return arr;
    }
}