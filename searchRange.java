class Solution
{
    public int[] searchRange(int[] nums, int target)
    {
        int[] positions = {-1, -1};
        boolean startFound = false;

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] == target)
            {
                if(startFound)
                    positions[1] = i;
                
                else
                {
                    positions[0] = i;
                    positions[1] = i;
                    startFound = true;
                }
            }
        }

        return positions;
    }
}
