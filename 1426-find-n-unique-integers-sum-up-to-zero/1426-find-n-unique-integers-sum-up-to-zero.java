class Solution {
    public int[] sumZero(int n) {
                    int[] arr = new int[n];
                    int start = 0 -(n/2);
        if(n%2!=0){
                int in =0;
            for(int i=0; i<n ; i++){
                arr[i]=start;
                start = start + 1;
            }
            return arr;
        }

        for (int i = 0; i < n / 2; i++) {
            arr[i] = start;
            arr[arr.length - i - 1] = start + (- start*2 );
            start++;
        }
        return arr;
    }
}