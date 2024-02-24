class Solution
{
    public int addDigits(int num)
    {
        int sumOfDigits;

        while(num >= 10)
        {
            sumOfDigits = 0;

            while(num > 0)
            {
                sumOfDigits += num % 10;
                num /= 10;
            }

            num = sumOfDigits;
        }

        return num;
    }
}
