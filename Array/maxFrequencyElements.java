import java.util.HashMap;

class Solution
{
    public int maxFrequencyElements(int[] nums)
    {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int maxFreq = 1;

        for(int i : nums)
        {
            if(!freq.containsKey(i))
            {
                freq.put(i, 1);
                continue;
            }

            freq.put(i, freq.get(i) + 1);
            if(freq.get(i) > maxFreq)
                maxFreq= freq.get(i);
        }

        int totalElements = 0;

        for(int i : freq.keySet())
            if(freq.get(i) == maxFreq)
                totalElements += maxFreq;
        
        return totalElements;
    }
}
