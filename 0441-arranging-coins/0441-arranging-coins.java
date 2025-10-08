class Solution {
    public int arrangeCoins(int n) {
        if(n==1)return n;
        int min;
        int sub =1;
        int step = 0;
        
        while(sub <= n){
            n -= sub;
            sub++;
            step++;
        }
        return sub-1;
    }
}