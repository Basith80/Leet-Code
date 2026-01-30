class Solution {
    public String reverseWords(String s) {
        // Abdul Basith
        StringBuilder t = new StringBuilder();
        StringBuilder res = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != ' '){
                t.append(s.charAt(i));
            }
            if(s.charAt(i) == ' ' || i == s.length()-1){
                res.append(reverse(t.toString()));
                t.setLength(0);
                if(i != s.length()-1){
                    res.append(" ");
                }
            }
        }
        return res.toString();

    }
    private static String reverse(String s){
         StringBuilder ans = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--){
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}