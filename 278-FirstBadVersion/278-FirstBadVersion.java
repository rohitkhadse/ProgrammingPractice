// Last updated: 8/24/2025, 12:32:29 PM
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 0;
        int r = n;
        
        while(l<r)
        {
            int m = l +(r-l)/2;
            
            if(isBadVersion(m))
            {
               r = m;
            }
            else
            {
                l = m+1;
            }
        }
        
        if(l==r && isBadVersion(l))
        {
            return l;
        }
        
        return -1;
    }
}