class Solution
{
    public boolean isPowerOfFour(int n)
    {
        for(int i = 0 ; true ; i++)
        {
            if(Math.pow(4, i) == n)
                return true;
            else if(Math.pow(4, i) > n)
                break;
        }

        return false;
    }
}
