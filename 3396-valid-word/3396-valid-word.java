class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3) return false;
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));

        if(vowelCheck(word , vowels) && numberCheck(word) && consonantCheck(word , vowels)){
            return true;
        } 
        return false;
    }
    static boolean vowelCheck(String word , ArrayList<Character> vowels ){
        for(int i=0; i<word.length(); i++){
            if(vowels.contains(word.charAt(i))){
                return true;
            }
        }
        return false;
    }

    static boolean numberCheck(String word){
        for(int i=0; i<word.length() ; i++){
            if(!Character.isAlphabetic(word.charAt(i))){
                if(Character.isDigit(word.charAt(i))){
                    continue;
                }
                else return false;
            }
        }
        return true;
    }

    static boolean consonantCheck(String word, List<Character> vowels) {
    for (char c : word.toCharArray()) {
        if (Character.isLetter(c) && !vowels.contains(c)) {
            return true; // found a real consonant
        }
    }
    return false;
}

}