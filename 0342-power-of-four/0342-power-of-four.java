class Solution {
    public boolean isPowerOfFour(int n) {
        return helper(n , 0);
    }
    static boolean helper(int n , int in){
        if(Math.pow(4,in)> n) return false;
        if(Math.pow(4,in)==n) return true;

        return helper( n, ++in);
    }
}