class Solution {
    public String mergeAlternately(String a, String b) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < a.length() && i < b.length()) {
            sb.append(a.charAt(i));
            sb.append(b.charAt(i));
            i++;
        }
        if (i < a.length()) {
            while (i < a.length()) {
                sb.append(a.charAt(i++));
            }
        }

        if (i < b.length()) {
            while (i < b.length()) {
                sb.append(b.charAt(i++));
            }
        }
        return sb.toString();
    }
}