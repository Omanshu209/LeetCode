class Solution
{
    public int islandPerimeter(int[][] grid)
    {
        int perimeter = 0;
        
        for(int i = 0 ; i < grid.length ; i++)
        {
            for(int j = 0 ; j < grid[0].length ; j++)
            {
                if(grid[i][j] == 0)
                    continue;
                
                int add = 4;
                
                if(i - 1 >= 0)
                    add -= grid[i - 1][j];
                if(i + 1 < grid.length)
                    add -= grid[i + 1][j];
                if(j - 1 >= 0)
                    add -= grid[i][j - 1];
                if(j + 1 < grid[0].length)
                    add -= grid[i][j + 1];
                
                perimeter += add;
            }
        }
        
        return perimeter;
    }
}
