// Last updated: 8/24/2025, 12:32:41 PM
class Solution {
    public int reverse(int x) { //123 --> 321
        
        long rev = 0;
        while(x!=0)
        {
                int digit = x % 10;
                rev = rev*10 + digit;
                x = x/10;
        }
        
        if(rev > (Math.pow(2, 31)-1) || rev < -(Math.pow(2, 31)) )
        {
            return 0;
        }
        
        return (int)rev;
     }
}