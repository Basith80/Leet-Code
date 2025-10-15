class Solution {
    public int findDuplicate(int[] arr) {
        int in = 0;

        while(in < arr.length){
            int c = arr[in]-1;

            if(arr[c] != arr[in]){
                int t = arr[c];
                arr[c] = arr[in];
                arr[in] = t;
            }else{
                in++;
            }
        }

        for(int i =0 ;i < arr.length; i++){
            if(arr[i]-1 != i){
                return arr[i];
            }
        }
        return -1;
    }
}