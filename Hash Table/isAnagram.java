import java.util.HashMap;

class Solution
{
    public boolean isAnagram(String s, String t)
    {
        HashMap<Character, Integer> uniqueChar = new HashMap<Character, Integer>();

        for(char c : s.toCharArray())
        {
            if(!uniqueChar.containsKey(c))
            {
                uniqueChar.put(c, 1);
                continue;
            }

            uniqueChar.put(c, uniqueChar.get(c) + 1);
        }

        for(char c : t.toCharArray())
        {
            if(!uniqueChar.containsKey(c))
                return false;
            
            uniqueChar.put(c, uniqueChar.get(c) - 1);
        }

        for(int value : uniqueChar.values())
            if(value != 0)
                return false;
        
        return true;
    }
}
