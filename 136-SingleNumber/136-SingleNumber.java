// Last updated: 8/24/2025, 12:32:32 PM
class Solution {

    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i],0);
            map.put(nums[i],map.get(nums[i]) + 1);
        }
        
        for(int i : nums)
        {
            if(map.get(i) == 1)
            {
                return i;
            }
        }
        
        return 0;
    }
}
