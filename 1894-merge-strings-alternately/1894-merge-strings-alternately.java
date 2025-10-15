class Solution {
    public String mergeAlternately(String a, String b) {
        int i =0;
        int j = 0;
        String ans = "";
        while( i < a.length() && j < b.length()){
            ans += a.charAt(i++);
            ans += b.charAt(j++);
            
        }

        if(i < a.length()){
            while(i<a.length()){
                ans += a.charAt(i++);
            }
        }

        if( j < b.length()){
            while(j < b.length()){
                ans += b.charAt(j++);
            }
        }
        return ans;
    }
}