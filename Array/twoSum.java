class Solution
{
    public int[] twoSum(int[] nums, int target)
    {
        int[] solution = {-1, -1};

        for(int i = 0 ; i < nums.length - 1 ; i++)
        {
            for(int j = i + 1 ; j < nums.length ; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    solution[0] = i;
                    solution[1] = j;
                    return solution;
                }
            }
        }

        return solution;
    }
}
