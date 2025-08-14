class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[(nums1.length + nums2.length)];
        int in = 0;
        for (int ele : nums1) {
            arr[in] = ele;
            in++;
        }
        for (int ele : nums2) {
            arr[in] = ele;
            in++;
        }
        Arrays.sort(arr);

        if (arr.length % 2 == 1) {
            return arr[arr.length / 2];
        }

        return (double) (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2;
    }
}