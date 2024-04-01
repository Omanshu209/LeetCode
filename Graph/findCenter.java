// Solution 1

class Solution
{
    public int findCenter(int[][] edges)
    {
        int n = 1;
        for(int[] edge : edges)
            for(int v : edge)
                if(v > n)
                    n = v;
        
        int[][] adMatrix = new int[n + 1][n + 1];
        
        for(int[] edge : edges)
        {
            adMatrix[edge[0]][edge[1]] = 1;
            adMatrix[edge[1]][edge[0]] = 1;
        }

        for(int i = 0 ; i <= n ; i++)
        {
            int edgeCount = 0;

            for(int val : adMatrix[i])
                edgeCount += val;
            
            if(edgeCount + 1 == n)
                return i;
        }

        return -1;
    }
}

// Solution 2

class Solution
{
    public int findCenter(int[][] edges)
    {
        int n = 1;
        for(int[] edge : edges)
            for(int v : edge)
                if(v > n)
                    n = v;
        
        int[] edgeCount = new int[n + 1];
        
        for(int[] edge : edges)
        {
            edgeCount[edge[0]]++;
            edgeCount[edge[1]]++;
        }

        for(int i = 0 ; i <= n ; i++)
            if(edgeCount[i] + 1 == n)
                return i;

        return -1;
    }
}
