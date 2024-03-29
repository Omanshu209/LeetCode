// Solution - 1

class Solution
{
    private static String reverse(String s, int index)
    {
        if(index == s.length())
            return "";
        
        return reverse(s, index + 1) + s.charAt(index);
    }

    public boolean isPalindrome(String s)
    {
        String newStr = "";
        char ch;

        for(int i = 0 ; i < s.length() ; i++)
        {
            ch = Character.toLowerCase(s.charAt(i));

            if(Character.isLetterOrDigit(ch))
                newStr += ch;
        }

        if(newStr.equals(reverse(newStr, 0)))
            return true;
        
        return false;
    }
}

// Solution - 2

class Solution
{
    public boolean isPalindrome(String s)
    {
        String newStr = "", reverseStr = "";
        char ch;

        for(int i = 0 ; i < s.length() ; i++)
        {
            ch = Character.toLowerCase(s.charAt(i));

            if(Character.isLetterOrDigit(ch))
            {
                newStr += ch;
                reverseStr = ch + reverseStr;
            }
        }

        if(newStr.equals(reverseStr))
            return true;
        
        return false;
    }
}
