// Last updated: 8/24/2025, 12:32:37 PM
class Solution {
    
    public static Map<Integer, Integer> map = new HashMap<>();
    
    public int climbStairs(int n) {
        /*
        1+1+1+1
        1+1+2
        2+1+1
        1+2+1
        2+2
        */
        if(n==1)
        {
            return 1;
        }
        if(n==2)
        {
            return 2;
        }
        
        if(map.containsKey(n))
        {
            return map.get(n);
        }
        
        map.put(n,climbStairs(n-1)+climbStairs(n-2));
        
        return map.get(n);
    }
}