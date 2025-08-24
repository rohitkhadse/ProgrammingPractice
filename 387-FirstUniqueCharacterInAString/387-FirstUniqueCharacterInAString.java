// Last updated: 8/24/2025, 12:32:25 PM
class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> lmap = new LinkedHashMap<Character,Integer>();
        
        for (int i = 0; i<s.length();i++)
        {
            if(lmap.containsKey(s.charAt(i)))
            {
                lmap.put(s.charAt(i),lmap.get(s.charAt(i))+1);
            }
            else
            {
                lmap.put(s.charAt(i),1);
            }
        }
        
        Set<Character> setKeys = lmap.keySet();
        
        for(Character key: setKeys)
        {
            if(lmap.get(key) == 1)
            {
                return s.indexOf(key);
            }
        }
        
        return -1;
    }
}