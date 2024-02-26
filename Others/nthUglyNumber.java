class Solution
{
    private static boolean isUgly(int n)
    {
        while(n % 2 == 0)
            n /= 2;

        while(n % 3 == 0)
            n /= 3;

        while(n % 5 == 0)
            n /= 5;
        
        return n == 1;
    }

    public int nthUglyNumber(int n)
    {
        int k = 1;

        while(n > 0)
        {
            if(isUgly(k))
                n--;
            k++;
        }

        return --k;
    }
}
