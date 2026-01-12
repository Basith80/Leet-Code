class Solution {
    public int removeElement(int[] arr, int val) {
        if(arr.length == 1 && arr[0] != val) return 1;
        if(arr.length == 1 && arr[0] == val) return 0;

       int i=0;
       int j=1;
       while(j<arr.length){
        if(arr[i] == val && arr[j] != val){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]= temp;
            i++; 
            j++;
        }
        else if(arr[i] == val && arr[j] == val){
            j++;
        }
        else{
            i++;
            j++;
        }
       } 
       int l =0;
       for(int k=0; k<arr.length; k++){
            if(arr[k] != val) l++;
       }
       return l;
    }
}