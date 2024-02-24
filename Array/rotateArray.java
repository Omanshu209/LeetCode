class Solution
{
    public void rotate(int[] nums, int k)
    {
        k %= nums.length;
        int temp;
        
        while(k > 0)
        {
            for(int i = 1 ; i < nums.length ; i++)
            {
                temp = nums[0];
                nums[0] = nums[i];
                nums[i] = temp;
            }
            k--;
        }
    }
}
