class Solution
{
    public int missingNumber(int[] nums)
    {
        boolean isAvailable;
        
        for(int i = 0 ; i <= nums.length ; i++)
        {
            isAvailable = false;

            for(int j = 0 ; j < nums.length ; j++)
            {
                if(nums[j] == i)
                {
                    isAvailable = true;
                    break;
                }
            }

            if(!isAvailable)
                return i;
        }

        return -1;
    }
}
