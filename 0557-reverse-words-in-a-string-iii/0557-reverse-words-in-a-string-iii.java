class Solution {
    public String reverseWords(String s) {
        // Abdul Basith
        String t = "";
        String res = "";

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != ' '){
                t+=s.charAt(i);
            }
            if(s.charAt(i) == ' ' || i == s.length()-1){
                res+= reverse(t);
                t="";
                if(i != s.length()-1){
                    res += " ";
                }
            }
        }
        return res;

    }
    private static String reverse(String s){
        String ans= "";
        for(int i=s.length()-1; i>=0; i--){
            ans += s.charAt(i);
        }
        return ans;
    }
}