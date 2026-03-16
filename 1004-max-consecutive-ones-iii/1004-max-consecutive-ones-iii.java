class Solution {
        public int longestOnes(int[] nums, int k) {
        if(nums.length == 1){
            if(nums[0] == 1){
                return 1;
            }else {
                return 0;
            }
        }
        boolean check = true;
        for(int ele : nums){
            if(ele == 0){
                check = false;
                break;
            }
        }
        if (check){
            return nums.length;
        }

        int r =0, l=0, z = 0, ml = 0,cl=0;
        while(r < nums.length){
            if(nums[r] == 0) z++;
            while(z > k){
                if(nums[l] == 0) z--;
                l++;
                cl--;
            }
            if(z <= k){
                
                cl =  r - l + 1;
                 r++;
            ml = Math.max(ml, cl);
            }
        }
        return ml;
    }
}