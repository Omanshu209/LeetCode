// Solution 1 (Using HashMap)

import java.util.HashMap;

class Solution
{
    public boolean isHappy(int n)
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int sum;

        while(n != 1)
        {
            sum = 0;

            while(n > 0)
            {
                sum += Math.pow(n % 10, 2);
                n /= 10;
            }

            if(map.containsKey(sum))
                return false;
            else
                map.put(sum, 1);

            n = sum;
        }

        return true;
    }
}

// Solution 2 (Using HashSet) - uses lesser memory

import java.util.HashSet;

class Solution
{
    public boolean isHappy(int n)
    {
        HashSet<Integer> set = new HashSet<Integer>();
        int sum;

        while(n != 1)
        {
            sum = 0;

            while(n > 0)
            {
                sum += Math.pow(n % 10, 2);
                n /= 10;
            }

            if(set.contains(sum))
                return false;
            else
                set.add(sum);

            n = sum;
        }

        return true;
    }
}
