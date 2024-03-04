class Solution
{
    public int[] twoSum(int[] numbers, int target)
    {
        int[] index = {0, numbers.length - 1};
        int sum;

        while(index[0] <= index[1])
        {
            sum = numbers[index[0]] + numbers[index[1]];

            if(sum == target)
            {
                index[0]++;
                index[1]++;
                return index;
            }

            else if(sum > target)
                index[1]--;
            else
                index[0]++;
        }

        return index;
    }
}
