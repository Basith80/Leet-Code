class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap <Character , Integer> map = new HashMap<>();
        int ml = 0;
        int l = 0;
        for(int r=0; r < s.length(); r++){
            char ch = s.charAt(r);
            if(map.containsKey(ch)){
                l = Math.max(l , map.get(ch) + 1);
            }
            map.put(ch , r);
            ml = Math.max(ml, r - l + 1);
        }
        return ml;
    }
}