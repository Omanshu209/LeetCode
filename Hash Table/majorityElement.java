import java.util.HashMap;

class Solution
{
    public int majorityElement(int[] nums)
    {
        if(nums.length == 1)
            return nums[0];

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i : nums)
        {
            if(!map.containsKey(i))
            {
                map.put(i, 1);
                continue;
            }

            map.put(i, map.get(i) + 1);

            if(map.get(i) > nums.length / 2)
                return i;
        }

        return -1;
    }
}
