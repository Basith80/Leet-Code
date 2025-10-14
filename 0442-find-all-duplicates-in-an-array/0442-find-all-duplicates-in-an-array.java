class Solution {
    public List<Integer> findDuplicates(int[] arr) {
         int in = 0;

        while(in < arr.length){
            int correct = arr[in]-1;
            if(arr[correct] != arr[in]){
                int temp = arr[in];
                arr[in] = arr[correct];
                arr[correct] = temp;
            }else{
                in++;
            }
        }

        ArrayList <Integer>list = new ArrayList<>();
        for(int i=0 ; i<arr.length; i++){
            if(i != arr[i]-1){
               list.add(arr[i]);
            }
        }
        return list;
    }
}