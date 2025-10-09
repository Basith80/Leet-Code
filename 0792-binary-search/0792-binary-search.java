class Solution {
    public int search(int[] nums, int target) {
        int s = 0; 
        int e = nums.length-1;
        return searchIn(nums , target , s ,e);
     }

     static int searchIn(int[] nums , int target ,  int s , int e){
        int m = s+(e-s)/2;
        if(s>e) return -1;

        if(nums[m] == target) return m;
        if(nums[m]> target){
           return searchIn(nums , target , s , m-1);
        }
       return  searchIn(nums , target , m+1 , e);
     }
}