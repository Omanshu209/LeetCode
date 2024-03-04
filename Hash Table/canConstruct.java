import java.util.HashMap;

class Solution
{
    public boolean canConstruct(String ransomNote, String magazine)
    {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : ransomNote.toCharArray())
        {
            if(!map.containsKey(c))
            {
                map.put(c, 1);
                continue;
            }

            map.put(c, map.get(c) + 1);
        }

        for(char c : magazine.toCharArray())
        {
            if(map.containsKey(c))
                if(map.get(c) != 0)
                    map.put(c, map.get(c) - 1);
        }

        for(char c : map.keySet())
            if(map.get(c) != 0)
                return false;
        
        return true;
    }
}
