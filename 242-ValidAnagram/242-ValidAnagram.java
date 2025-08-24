// Last updated: 8/24/2025, 12:32:28 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        ArrayList<Character> strArr = new ArrayList();
        
        if(s.length() != t.length())
        {
            return false;
        }
        for (int i=0;i<s.length();i++)
        {
            strArr.add(s.charAt(i));
        }
        
        for(int j=0;j<t.length();j++)
        {
            if(strArr.contains(t.charAt(j)))
            {
                strArr.remove(Character.valueOf(t.charAt(j)));   
            }
        }
        
        if(strArr.isEmpty())
        {
            return true;    
        }
        
        return false;
    }
}