class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int s = 0;
        int e = n - 1;
        while (s < e) {
            swap(nums, s++, e--);
        }
        s = 0;
        e = k - 1;
        while (s < e) {
            swap(nums, s++, e--);
        }
        s = k;
        e = n - 1;
        while (s < e) {
            swap(nums, s++, e--);
        }

    }

    static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }

}