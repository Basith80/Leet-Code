class Solution {
    public boolean halvesAreAlike(String s) {
        int i = s.length() /2 - 1;
        int j = i+1;

        int n1 =0;
        int n2 =0;

        for(int k=0; k<= i; k++){
            if(s.charAt(k) == 'A' || s.charAt(k) == 'E' || s.charAt(k) == 'I' || s.charAt(k) == 'O' || s.charAt(k) == 'U' || s.charAt(k) == 'a' || s.charAt(k) == 'e' || s.charAt(k) == 'i' || s.charAt(k) == 'o' || s.charAt(k) == 'u'  ){
n1++;
            }
        }

         for(int k=j; k< s.length() ; k++){
            if(s.charAt(k) == 'A' || s.charAt(k) == 'E' || s.charAt(k) == 'I' || s.charAt(k) == 'O' || s.charAt(k) == 'U' || s.charAt(k) == 'a' || s.charAt(k) == 'e' || s.charAt(k) == 'i' || s.charAt(k) == 'o' || s.charAt(k) == 'u' ){
n2++;
            }
        }

        return n1 == n2;
    }
}