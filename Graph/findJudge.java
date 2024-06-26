// Solution 1

class Solution
{
    public int findJudge(int n, int[][] trust)
    {
        int[][] adMatrix = new int[n][n];

        for(int i = 0 ; i < n ; i++)
            for(int j = 0 ; j < n ; j++)
                adMatrix[i][j] = 0;

        for(int[] t : trust)
            adMatrix[t[0] - 1][t[1] - 1] = 1;
        
        for(int i = 0 ; i < n ; i++)
        {
            int trustCount = 0;
            for(int j : adMatrix[i])
                trustCount += j;
            
            if(trustCount != 0)
                continue;
            
            int isTrusted = 0;
            for(int j = 0 ; j < n ; j++)
                isTrusted += adMatrix[j][i];
            
            if(isTrusted + 1 == n)
                return i + 1;
        }

        return -1;
    }
}

// Solution 2

class Solution
{
    public int findJudge(int n, int[][] trust)
    {
        int[] trustCount = new int[n];
        int[] trustableCount = new int[n];

        for(int[] t : trust)
        {
            trustableCount[t[0] - 1]++;
            trustCount[t[1] - 1]++;
        }

        for(int i = 0 ; i < n ; i++)
            if(trustableCount[i] == 0 && trustCount[i] + 1 == n)
                return i + 1;
        
        return -1;
    }
}
