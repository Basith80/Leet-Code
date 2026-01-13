class Solution {
    public void nextPermutation(int[] arr) {
        int in = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i+1]) {
                in = i;
                break;
            }
        }
        if (in != -1) {
            for(int i=arr.length-1; i> in; i--){
                if(arr[i] > arr[in]){
                    swap(i, in, arr);
                    break;
                }
            }
        }
        reverse(in+1 , arr.length-1, arr);
    }

    void reverse(int a, int b, int[] arr) {
        while (a < b) {
            swap(a, b, arr);
            a++;
            b--;
        }
    }
    void swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}