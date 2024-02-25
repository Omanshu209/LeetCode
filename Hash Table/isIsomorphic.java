import java.util.HashMap;

class Solution
{
    public boolean isIsomorphic(String s, String t)
    {
        if(s.length() != t.length())
            return false;

        HashMap<Character, Character> map = new HashMap<Character, Character>();
        char key, value;

        for(int i = 0 ; i < s.length() ; i++)
        {
            key = s.charAt(i);
            value = t.charAt(i);

            if(!map.containsKey(key))
            {
                if(map.containsValue(value))
                    return false;
                map.put(key, value);
                continue;
            }

            if(map.get(key) != value)
                return false;
        }

        return true;
    }
}
