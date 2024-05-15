class Solution
{

public:
    vector<int> sortArrayByParity(vector<int>& nums)
    {
        // Bubble Sort
        for(int i = 0 ; i < nums.size() - 1 ; i++)
        {
            for(int j = 0 ; j < nums.size() - i - 1 ; j++)
            {
                if(nums[j] % 2 != 0 && nums[j + 1] % 2 == 0)
                {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        return nums;
    }
};
