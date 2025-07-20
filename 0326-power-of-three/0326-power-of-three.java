class Solution {
    public boolean isPowerOfThree(int n) {
       return helper(n,0);
    }
    private boolean helper(int n , int in){
        if(Math.pow(3,in) > n) return false;

        if(Math.pow(3 , in)==n) return true;

        return helper(n , ++in);
    }
}