// Last updated: 8/24/2025, 12:32:30 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        boolean result = false;
        
        for(int i : nums)
        {
            if(set.contains(i))
            {
                result = true;
            }
            
            set.add(i);
        }
        
        return result;
    }
}