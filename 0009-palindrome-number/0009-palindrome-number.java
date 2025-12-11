class Solution {
    public boolean isPalindrome(int x) {
        if(x < 1) return false;
        int temp = x;
       int reversed = 0;

       while(temp != 0){
        reversed *=10;
        reversed += temp%10;
        temp /= 10;
       }
        return reversed == x;
    }
}