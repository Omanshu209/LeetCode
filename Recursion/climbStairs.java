class Solution
{
    private static int climb(int n, int climbed)
    {
        if(n == climbed || n == climbed + 1)
            return 1;
        
        return climb(n, climbed + 1) + climb(n, climbed + 2);
    }

    public int climbStairs(int n)
    {
        return climb(n, 0);
    }
}
