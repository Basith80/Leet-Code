class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] arr= new int[image.length][image[0].length];
        
        for(int i=0 ; i<image.length; i++){
            int temp=0;
            for(int j=image[0].length-1; j>=0; j--){
                arr[i][temp] = image[i][j];
                temp++;
            }
        }

        for(int i=0; i<image.length; i++){
            for(int j=0; j<image.length; j++){
                if(arr[i][j]==0){
                    arr[i][j] =1;
                }else{
                    arr[i][j]=0;
                }
            }
        }
        return arr;
    }
}