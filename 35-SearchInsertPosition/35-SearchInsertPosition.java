// Last updated: 8/24/2025, 12:32:38 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        
        for(int i = 0; i< nums.length; i++)
        {
            if(nums[i] == target)
            {
                return i; 
            }
            
            System.out.println("i = " + i + " nums[i] = " + nums[i]);
            
            if(nums[i] > target)
            {
                return i; 
            }
        }
        
        if(nums[nums.length - 1] < target)
        {
            return nums.length;
        }
        
        return 0;
        
    }
}