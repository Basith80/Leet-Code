class Solution {
    public int[] findErrorNums(int[] arr) {
        int in = 0;

        while(in < arr.length){
            int correct = arr[in]-1;

            if(arr[correct] != arr[in]){
                int temp = arr[correct];
                arr[correct] = arr[in];
                arr[in] = temp;
            }else{
                in++;
            }
        }

        for(int i=0 ; i< arr.length ; i++){
            if(arr[i] != i+1){
                return new int[]{arr[i] , i+1};
            }
        }
        return new int[]{-1,-1};
    }
}