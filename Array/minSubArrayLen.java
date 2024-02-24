// Solution 1

class Solution
{
    public int minSubArrayLen(int target, int[] nums)
    {
        int length = 0, sum;

        for(int i = 0 ; i < nums.length ; i++)
        {
            sum = 0;

            for(int j = i ; j < nums.length ; j++)
            {
                sum += nums[j];

                if(sum >= target && ((j - i) + 1 < length || length == 0))
                {
                    length = (j - i) + 1;
                    break;
                }

                else if(sum > target)
                    break;
            }
        }

        return length;
    }
}

// Solution 2

class Solution
{
    public int minSubArrayLen(int target, int[] nums)
    {
        int length = 1, sum;

        while(length <= nums.length)
        {
            for(int i = 0 ; i <= nums.length - length ; i++)
            {
                sum = 0;

                for(int j = i ; j < i + length ; j++)
                {
                    sum += nums[j];
                
                    if(sum >= target)
                        return length;
                }
            }
            
            length++;
        }

        return 0;
    }
}
