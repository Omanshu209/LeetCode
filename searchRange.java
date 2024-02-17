class Solution
{
    public int[] searchRange(int[] nums, int target)
    {
        int[] positions = {-1, -1};

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] == target)
            {
                positions[1] = i;
                
                if(positions[0] == -1)
                    positions[0] = i;
            }
        }

        return positions;
    }
}
