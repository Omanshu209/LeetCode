// Solution 1 - Without Implementing Stack (Slower)

class Solution
{
    public boolean isValid(String s)
    {
        int parentheses = 0, square = 0, curly = 0;
        char bracket;
        String openedBrackets = "";

        for(int i = 0 ; i < s.length() ; i++)
        {
            bracket = s.charAt(i);

            switch(bracket)
            {
                case '(':
                    parentheses++;
                    openedBrackets += '(';
                    break;
                
                case ')':
                    if(openedBrackets.length() != 0)
                    {
                        if(openedBrackets.charAt(openedBrackets.length() - 1) == '(')
                        {
                            parentheses--;
                            openedBrackets = openedBrackets.substring(0, openedBrackets.length() - 1);
                        }

                        else
                            return false;
                    }
                    
                    else
                        return false;
                    
                    break;
                
                case '[':
                    square++;
                    openedBrackets += '[';
                    break;
                
                case ']':
                    if(openedBrackets.length() != 0)
                    {
                        if(openedBrackets.charAt(openedBrackets.length() - 1) == '[')
                        {
                            square--;
                            openedBrackets = openedBrackets.substring(0, openedBrackets.length() - 1);
                        }

                        else
                            return false;
                    }
                    
                    else
                        return false;
                    
                    break;
                
                case '{':
                    curly++;
                    openedBrackets += '{';
                    break;
                
                case '}':
                    if(openedBrackets.length() != 0)
                    {
                        if(openedBrackets.charAt(openedBrackets.length() - 1) == '{')
                        {
                            curly--;
                            openedBrackets = openedBrackets.substring(0, openedBrackets.length() - 1);
                        }

                        else
                            return false;
                    }

                    else
                        return false;

                    break;
            }
        }

        if(parentheses == 0 && square == 0 && curly == 0)
            return true;
        
        return false;
    }
}

// Solution 2 - Implementing Stack (faster)

import java.util.Stack;

class Solution
{
    public boolean isValid(String s)
    {
        Stack<Character> stack = new Stack<Character>();

        for(char ch : s.toCharArray())
        {
            if(ch == '(' || ch == '[' || ch == '{')
            {
                stack.push(ch);
                continue;
            }

            if(stack.isEmpty())
                return false;
            
            switch(ch)
            {
                case ')':
                    if(stack.peek() == '(')
                        stack.pop();
                    else
                        return false;
                    
                    break;
                    
                case ']':
                    if(stack.peek() == '[')
                        stack.pop();
                    else
                        return false;
                    
                    break;
                    
                case '}':
                    if(stack.peek() == '{')
                        stack.pop();
                    else
                        return false;
                    
                    break;
            }
        }

        if(stack.isEmpty())
            return true;
        
        return false;
    }
}
