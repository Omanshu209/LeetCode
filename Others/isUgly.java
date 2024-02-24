// Solution 1 - Slower

class Solution
{
    private static boolean isPrime(int i)
    {
        if(i % 2 != 0 )
        {
            for(int j = 2 ; j <= Math.sqrt(i) ; j++)
                if(i % j == 0)
                    return false;
        }

        else
            return false;
        
        return true;
    }

    public boolean isUgly(int n)
    {
        if(n <= 0)
            return false;

        for(int i = 7 ; i <= n ; i++)
            if(n % i == 0 && isPrime(i))
                return false;
        return true;
    }
}

// Solution 2 - Faster

class Solution
{
    public boolean isUgly(int n)
    {
        if(n <= 0)
            return false;

    	while(n % 2 == 0)
    		n /= 2;
    	
    	while(n % 3 == 0)
    		n /= 3;
    	
    	while(n % 5 == 0)
    		n /= 5;
    	
    	return n == 1;
    }
}
