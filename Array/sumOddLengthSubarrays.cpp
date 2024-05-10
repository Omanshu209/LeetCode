class Solution
{
public:

    int sumOddLengthSubarrays(vector<int>& arr)
    {
        int sum = 0;

        for(int i = 1 ; i <= arr.size() ; i++)
        {
            if(i % 2 == 0)
                continue;
            
            for(int j = 0 ; j <= arr.size() - i ; j++)
                for(int k = j ; k < j + i ; k++)
                    sum += arr[k];
        }

        return sum;
    }
};
