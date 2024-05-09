#include <vector>

class Solution
{
public:

    bool isSelfDividing(int num)
    {
        int temp_num = num;

        while(temp_num > 0)
        {
            int digit = temp_num % 10;

            if(digit == 0 || num % digit != 0)
                return false;
            
            temp_num /= 10;
        }

        return true;
    }

    vector<int> selfDividingNumbers(int left, int right)
    {
        vector<int> valid_numbers;

        for(int i = left ; i <= right ; i++)
            if(isSelfDividing(i))
                valid_numbers.push_back(i);
        
        return valid_numbers;
    }
};
