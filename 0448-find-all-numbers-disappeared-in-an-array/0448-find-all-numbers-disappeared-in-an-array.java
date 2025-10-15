class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int in = 0;

        while (in < nums.length) {
            int correct = nums[in] - 1;
            if (nums[correct] != nums[in]) {
                int temp = nums[correct];
                nums[correct] = nums[in];
                nums[in] = temp;
            }else{
                in++;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0 ; i < nums.length; i++){
            if(nums[i]-1 != i){
                list.add(i+1);
            }
        }

        return list;
    }
}