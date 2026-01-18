class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26) return false;
        boolean[] letters = new boolean[26];
        for(int i=0; i<sentence.length(); i++){
            int in = sentence.charAt(i)-97;;
            letters[in] = true;
        }
        for(int i=0; i<letters.length; i++){
            if(letters[i] == false) return false;
        }
        return true;
    }
}