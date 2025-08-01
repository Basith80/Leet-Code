class Solution {
    public boolean isPerfectSquare(int num) {
        double temp =  Math.sqrt(num);
        if(temp == Math.floor(temp) ){
            return true;
        }
        return false;
    }
}