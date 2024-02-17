// Method 1

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

// Method 2

class Solution
{
    public int[] searchRange(int[] nums, int target)
    {
        int[] positions = {-1, -1};

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] == target)
            {               
                positions[0] = i;
                break;
            }
        }

        for(int i = nums.length - 1 ; i >= 0 ; i--)
        {
            if(nums[i] == target)
            {
                positions[1] = i;
                break;
            }
        }

        return positions;
    }
}
