class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> list = new ArrayList<>();
        int one = 1;
        for(int i=digits.length-1; i>=0; i--){
            int ans = digits[i]+one;
            if(ans > 9){
                list.add(ans%10);
                one = ans/10;
            }else{
                list.add(ans);
                one =0;
            }
        }
        if(one>0){
            list.add(one);
        }
        Collections.reverse(list);
        int[] arr = new int[list.size()];
        for(int i=0 ; i<arr.length; i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}