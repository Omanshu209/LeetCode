class Solution
{
    public int[] plusOne(int[] digits)
    {
        boolean isCarried = false;
        final int len = digits.length;
        digits[len - 1]++;

        if(digits[len - 1] == 10)
        {
            digits[len - 1] = 0;
            isCarried = true;
        }

        if(isCarried)
        {
            for(int i = len - 2 ; i >= 0 ; i--)
            {
                if(digits[i] < 9)
                {
                    digits[i]++;
                    isCarried = false;
                    break;
                }

                digits[i] = 0;
            }
        }

        int[] sum;

        if(isCarried)
        {
            sum = new int[len + 1];
            sum[0] = 1;

            for(int i = 1 ; i <= len ; i++)
                sum[i] = digits[i - 1];
        }

        else
            return digits;
        
        return sum;
    }
}
