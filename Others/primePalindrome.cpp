class Solution
{
public:

    bool isPrime(int num)
    {
        if(num == 1)
            return false;

        for(int i = 2 ; i < num ; i++)
            if(num % i == 0)
                return false;
        
        return true;
    }

    bool isPalindrome(int num)
    {
        int temp_num = num, reversedNum = 0;

        while(temp_num > 0)
        {
            reversedNum *= 10;
            reversedNum += temp_num % 10;
            temp_num /= 10;
        }

        if(num == reversedNum)
            return true;
        return false;
    }

    int primePalindrome(int n)
    {
        while(true)
        {
            if(isPrime(n) && isPalindrome(n))
                return n;
            n++;
        }
    }
};
