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

        for(int j =0 ;j<arr.length ; j++){
            if(j+1 != arr[j]){
                return new int[] {arr[j] , j+1};
            }
        }

        return new int[]{-1,-1};
    }
}