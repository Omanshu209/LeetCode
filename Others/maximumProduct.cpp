class Solution
{
public:

    int maximumProduct(vector<int>& nums)
    {
        // Selection Sort
        for(int i = 0 ; i < nums.size() - 1 ; i++)
        {
            int max = i;

            for(int j = i ; j < nums.size() ; j++)
                if(nums[j] > nums[max])
                    max = j;
            
            int temp = nums[max];
            nums[max] = nums[i];
            nums[i] = temp;
        }

        return max(nums[0] * nums[1] * nums[2], nums[0] * nums[nums.size() - 1] * nums[nums.size() - 2]);
    }
};
