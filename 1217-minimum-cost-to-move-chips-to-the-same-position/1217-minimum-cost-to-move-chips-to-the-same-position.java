class Solution {
    public int minCostToMoveChips(int[] position) {
        int even = 0, odd = 0;
        for (int ele : position) {
            if (ele % 2 == 0)
                even++;
            else
                odd++;
        }

        if(odd == position.length || even == position.length) {
            return 0;
        }
        return Math.min(even,odd);
    }
}