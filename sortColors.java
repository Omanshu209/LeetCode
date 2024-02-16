class Solution
{
    public void sortColors(int[] nums)
    {
        int index, temp;

        for(int i = 0 ; i < nums.length - 1 ; i++)
        {
            index = i;

            for(int j = i ; j < nums.length ; j++)
                if(nums[j] < nums[index])
                    index = j;
            
            temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
        }
    }
}
