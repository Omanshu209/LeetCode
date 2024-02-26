import java.util.HashMap;

class Solution
{
    public int mostFrequentEven(int[] nums)
    {
        if(nums.length == 1 && nums[0] % 2 == 0)
            return nums[0];

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = -1, maxFrequency = 0, frequency;

        for(int i : nums)
        {
            if(i % 2 == 0)
            {
                if(!map.containsKey(i))
                    map.put(i, 1);

                map.put(i, map.get(i) + 1);
                frequency = map.get(i);

                if(frequency > maxFrequency || (frequency == maxFrequency && i < max))
                {
                    max = i;
                    maxFrequency = frequency;
                }
            }
        }

        return max;
    }
}
