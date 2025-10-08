/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int s = 1;
        int e = n;
        while(s <= e){
            int m = s + (e - s) / 2;

            if(isBadVersion(m) == false){
                if(isBadVersion(m+1) == true){
                    return m +1;
                }else{
                    s = m+1;
                }
            }
            else if(isBadVersion(m) == true){
                if(isBadVersion(m-1) == false){
                    return m;
                }else{
                    e = m-1;
                }
            }
        }

        return n;
    }
}