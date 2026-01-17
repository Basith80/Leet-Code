class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n==0)return;
        k= k%n;
        if(k==0)return;
        int i=0;
        int j=n-1;
        while(i <j){
            swap(i++, j--, nums);
        }
        i=0;
        int t =k-1;
        while(i<t){
            swap(i++,t--,nums);
        }
       i=n-1;
       while(k<i){
        swap(k++,i--,nums);
       }
        
    }
    private static void swap(int a , int b, int[]nums){
        int temp = nums[a];
        nums[a]= nums[b];
        nums[b] = temp;
    }

}