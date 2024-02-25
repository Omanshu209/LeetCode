import java.util.List;
import java.util.LinkedList;
import java.util.HashMap;

class Solution
{
    public List<Integer> majorityElement(int[] nums)
    {
        List<Integer> list = new LinkedList<Integer>();

        if(nums.length == 1 || nums.length == 2)
        {
            for(int i : nums)
                if(!list.contains(i))
                    list.add(i);
            return list;
        }

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i : nums)
        {
            if(!map.containsKey(i))
            {
                map.put(i, 1);
                continue;
            }

            map.put(i, map.get(i) + 1);
            if(map.get(i) > nums.length / 3 && !list.contains(i))
                list.add(i);
        }

        return list;
    }
}
