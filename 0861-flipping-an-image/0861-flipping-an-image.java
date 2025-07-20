class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int index=0;
        int[][] arr = new int[image.length][image[0].length];
        int in=0;
        for(int i=0; i<image.length; i++ ){
            for(int j=image[0].length-1; j>=0; j--){
                arr[i][in]=image[i][j];
                in++;
            }
            in=0;
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]==0){
                    arr[i][j]=1;
                }else if(arr[i][j]==1){
                    arr[i][j]=0;
                }
            }
        }
        return arr;
    }
}