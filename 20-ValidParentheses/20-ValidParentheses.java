// Last updated: 8/24/2025, 12:32:39 PM
class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        char[]  charArry = s.toCharArray();
        
        for(int i=0; i < charArry.length;i++)
        {
              if(charArry[i] == '(' || charArry[i]=='{' || charArry[i]=='[')
              {
                  stack.push(charArry[i]);
              }
              else
              {
                  if(stack.isEmpty())
                  {
                      return false;
                  }
                  else
                  {
                      char openingBracket = stack.peek();
                      if((openingBracket == '(' && charArry[i] == ')') ||
                            (openingBracket == '{' && charArry[i] == '}') ||
                            (openingBracket == '[' && charArry[i] == ']')
                        )
                      {
                          stack.pop();
                      }
                      else
                      {
                          return false;
                      }
                  }
              }
        }
        
        return stack.isEmpty();
    }
}