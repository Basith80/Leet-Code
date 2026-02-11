class Solution {
    public String reverseWords(String s) {
        return rotate(s);
    }

    private static String rotate(String s){
        String ans = "";
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                ans+= reverse(sb);
                ans+=" ";
                sb = new StringBuilder();
            }else{
                sb.append(s.charAt(i));
                if(i == s.length()-1){
                    ans+= reverse(sb);
                }
            }
        }
        return ans;
    }

    private static String reverse(StringBuilder sb){
        int l = sb.length()-1;
        String ans = "";
        for(int i=l; i>=0; i--){
            ans+=sb.charAt(i);
        }
        return ans;
    }

}