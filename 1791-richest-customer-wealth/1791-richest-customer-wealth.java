class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        int total=0;
        for(int i=0; i<accounts.length; i++){
            for(int j=0; j<accounts[0].length; j++){
                max +=accounts[i][j];
            }
            total=Math.max(total,max);
            max=0;
        }

        return total;
    }
}