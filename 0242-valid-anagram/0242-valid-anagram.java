class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int [] sarr = new int [26];
        int[] tarr = new int[26];
        for(int i=0; i<s.length(); i++){
            int in = s.charAt(i) - 'a';
            sarr[in]++;
        }
        for(int i=0; i<t.length(); i++){
            int in = t.charAt(i) - 'a';
            tarr[in]++;
        }
        for(int i=0; i<sarr.length; i++){
            if(sarr[i] != 0){
                if(sarr[i] != tarr[i]){
                    return false;
                }
            }
        }
        return true;
    }
}