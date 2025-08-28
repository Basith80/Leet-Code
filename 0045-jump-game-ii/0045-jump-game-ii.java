class Solution {
    public int jump(int[] arr) {
        int n = arr.length;
        if (n == 0 ) return -1;
        if (arr[0]==0) return 0;

        int jumps = 0;
        int currEnd = 0;
        int farthest = 0;

        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + arr[i]);

            if (i == currEnd) {
                jumps++;
                currEnd = farthest;
            }

            if (currEnd >= n - 1) break; 
    }

          return currEnd >= n - 1 ? jumps : -1;
    }
}