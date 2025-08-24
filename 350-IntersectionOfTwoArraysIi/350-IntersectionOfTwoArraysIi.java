// Last updated: 8/24/2025, 12:32:28 PM
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        
        for(int i = 0;i<nums1.length;i++)
        {
            if(map.containsKey(nums1[i]))
            {
                map.get(nums1[i]).add(i);
            }
            else
            {
                map.put(nums1[i], (new ArrayList<Integer>(Arrays.asList(i))));
            }
        }
                                
        List<Integer> result = new ArrayList<>();
        
        for(int j : nums2)
        {
            if(map.get(j) != null && !map.get(j).isEmpty())
            {
                result.add(j);
                map.get(j).remove(0);
            }
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}