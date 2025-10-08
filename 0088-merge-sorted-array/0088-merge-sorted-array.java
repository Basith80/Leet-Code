class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n){

            if(nums1[i] < nums2[j]){
                nums3[k] = nums1[i];
                k++;
                i++;
            }else {
                nums3[k] = nums2[j];
                j++;
                k++;
            }
        }

        while(i < m){
            nums3[k] = nums1[i];
            k++;
            i++;
        }

        while(j < n){
            nums3[k] = nums2[j];
            k++;
            j++;
        }

        int in = 0;
        for(int ele : nums3){
            nums1[in++] = ele;
        }

    }
}