// Solution 1 (Using HashMap)

import java.util.HashMap;

class Solution
{
    public boolean containsDuplicate(int[] nums)
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i : nums)
        {
            if(!map.containsKey(i))
            {
                map.put(i, 1);
                continue;
            }

            if(map.get(i) == 1)
                return true;
        }

        return false;
    }
}

// Solution 2 (Using HashSet) - uses less memory

import java.util.HashSet;

class Solution
{
    public boolean containsDuplicate(int[] nums)
    {
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i : nums)
        {
            if(!set.contains(i))
            {
                set.add(i);
                continue;
            }

            if(set.contains(i))
                return true;
        }

        return false;
    }
}
