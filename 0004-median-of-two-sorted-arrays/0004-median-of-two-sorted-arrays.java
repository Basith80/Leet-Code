import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int[] arr = new int[len];
        int i = 0; 
        int j = 0;
        while (true) {
            if (i != nums1.length) {
                arr[i] = nums1[i];
                i++;
            }else{
                arr[i+j] = nums2[j];
                j++;
            }
            if(j+i == arr.length) break;
        }
        for(int ii=0; ii<arr.length; ii++){
            for(int jj=0; jj< arr.length; jj++){
                if(arr[ii] < arr[jj]){
                    int temp = arr[ii];
                    arr[ii]= arr[jj];
                    arr[jj] = temp;
                }
            }
        }
        if(arr.length % 2 != 0){
            return arr[arr.length/2 ];
        }
        return (double) (arr[arr.length / 2 -1] + arr[arr.length / 2 ]) / 2;
    }
}