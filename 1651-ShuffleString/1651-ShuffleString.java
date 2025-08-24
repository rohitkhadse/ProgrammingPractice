// Last updated: 8/24/2025, 12:32:17 PM
class Solution {
    public String restoreString(String s, int[] indices) {
        
        char[] charArr = new char[s.length()];
        
        
        for(int i=0; i<s.length();i++)
        {
            charArr[indices[i]] = s.charAt(i);   
        }
        
        return String.valueOf(charArr);
    }
}