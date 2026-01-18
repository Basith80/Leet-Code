class Solution {
    public int largestAltitude(int[] gain) {
        int max =0;
        int path = 0;
        for(int i = 0; i<gain.length; i++){
            path += gain[i];
            max = Math.max(path, max);
        }
        return max;
    }
}