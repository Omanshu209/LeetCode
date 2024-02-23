// if x belongs between -2 ^ 31 and -2 ^ 31 - 1 -> return its reverse
// else -> return 0

class Solution
{
    public int reverse(int x)
    {
        long max = (int) Math.pow(2, 31);
        if(x >= max - 1  || x < -max)
            return 0;
        
        boolean isNegative = (x < 0) ? true : false;
        x = Math.abs(x);

        int reversedX = 0;
        int mul = (int) Math.pow(10, (Math.floor(Math.log10(x))));
        while(x > 0)
        {
            reversedX += (x % 10) * mul;
            mul /= 10;
            x /= 10;
        }

        if(isNegative)
            return -reversedX;
        
        return reversedX;
    }
}
