class Solution
{

public:

    vector<int> sortEvenOdd(vector<int>& nums)
    {
        bool swap = false;

        for(int i = 0 ; i < nums.size() / 2 ; i++)
        {
            for(int j = 0 ; j < nums.size() - i - 2 ; j ++)
            {
                if(j % 2 == 0)
                {
                    if(nums[j] > nums[j + 2])
                        swap = true;
                }

                else if(nums[j] < nums[j + 2])
                    swap = true;

                if(swap)
                {
                    int temp = nums[j];
                    nums[j] = nums[j + 2];
                    nums[j + 2] = temp;
                }

                swap = false;
            }
        }

        return nums;
    }
};
