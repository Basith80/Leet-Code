class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int l = k-1;
        int r = cardPoints.length - 1;
        int mp = 0;
        int lsum =0;
        int rsum =0;
        for(int i = 0; i<k; i++){
            lsum += cardPoints[i];
        }
        mp = Math.max(lsum, mp);


        for(int i = k-1; i>=0; i--){
            lsum = lsum - cardPoints[l--];
            rsum = rsum + cardPoints[r--];
            mp = Math.max(mp , rsum+lsum); 
        }

        return mp;
    }
}