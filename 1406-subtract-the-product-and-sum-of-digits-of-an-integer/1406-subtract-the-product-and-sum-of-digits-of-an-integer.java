class Solution {
    public int subtractProductAndSum(int n) {
        int mul = 1;
        int sum =0;
        int n1 =n;
        int n2 = n;
        while(n1 != 0){
            mul *= n1 % 10;
            n1 /= 10;
        }

        while(n2 != 0){
            sum += n2 % 10;
            n2 /= 10;
        }

        return mul - sum;
    }
}