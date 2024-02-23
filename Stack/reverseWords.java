import java.util.Stack;

class Solution
{
    public String reverseWords(String s)
    {
        Stack<String> stack = new Stack<String>();

        String str = "";
        char ch;
        
        for(int i = 0 ; i < s.length() ; i++)
        {
            ch = s.charAt(i);

            if(ch != ' ')
                str += ch;
            else if(ch == ' ' && str.length() != 0)
            {
                stack.push(str);
                str = "";
            }
        }

        if(str.length() != 0)
            stack.push(str);

        String newStr = "";
        while(!stack.isEmpty())
            newStr += stack.pop() + " ";
        
        return newStr.substring(0, newStr.length() - 1);
    }
}
