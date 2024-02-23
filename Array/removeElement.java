class Solution
{
    public int removeElement(int[] nums, int val)
    {
        int temp, k = nums.length;
        for(int i = 0 ; i < nums.length - 1 ; i++)
        {
            for(int j = 0 ; j < nums.length - i - 1 ; j++)
            {
                if(nums[j] == val)
                {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        for(int i = 0 ; i < nums.length ; i++)
            if(nums[i] == val)
                k--;
        
        return k;
    }
}
