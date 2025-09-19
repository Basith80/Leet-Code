class Solution {
    public boolean isHappy(int n) {
        int f = n;
        int s = n;
        do {
            f = findSqr(findSqr(f));
            s = findSqr(s);
        } while (s != f);
        if (s == 1) {
            return true;
        }
        return false;
    }

    private int findSqr(int n) {
        int ans = 0;
        while (n > 0) {
            int mod = n % 10;
            ans += mod * mod;
            n /= 10;
        }
        return ans;
    }
}