class Solution {
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int i=0; i < nums.length; i++){
            String n = Integer.toString(nums[i]);
            int len = n.length();
            if(len%2==0){
                ans++;
            }
        }
        return ans;
    }
}