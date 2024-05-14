class Solution
{

public:
    int arrayPairSum(vector<int>& nums)
    {
        // Bubble Sort
        for(int i = 0 ; i < nums.size() - 1 ; i++)
        {
            for(int j = 0 ; j < nums.size() - i - 1 ; j++)
            {
                if(nums[j] > nums[j + 1])
                {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        int sum = 0;
        for(int i = 0 ; i < nums.size() ; i += 2)
            sum += nums[i];
        
        return sum;
    }
};
