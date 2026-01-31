class Solution {
    public int addDigits(int num) {
        if(num < 10) return num;
        int add = 0;
        do{
            if(add !=0) {
                num = add; 
                add =0;
            }
            while(num != 0){
                add+=num%10; 
                num/=10;
            }
        }while(add>9);
        return add;
    }
}