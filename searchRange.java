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
                positions[1] = i;
                
                if(!startFound)
                {
                    positions[0] = i;
                    startFound = true;
                }
            }
        }

        return positions;
    }
}
