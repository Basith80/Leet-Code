class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        int [] arr = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            list.add(index[i],nums[i]);
        }     

        for(int i=0; i<nums.length; i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}