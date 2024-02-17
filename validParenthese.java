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
