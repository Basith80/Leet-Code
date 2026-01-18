class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0; i<image.length; i++){
            reverse(image[i]);
        }
        for(int i=0; i<image.length; i++){
            inverse(image[i]);
        }
        return image;
    }
    static void reverse(int[] image){
        int s =0;
        int e = image.length-1;
        while(s<e){
            int temp = image[s];
            image[s]= image[e];
            image[e] = temp;
            s++; e--;
        }
    }
    static void inverse(int[] image){
        for(int i=0; i<image.length; i++){
            if(image[i] == 0){
                image[i] =1;
            }else{
                image[i] = 0;
            }
        }
    }
}