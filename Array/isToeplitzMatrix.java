class Solution
{
    public boolean isToeplitzMatrix(int[][] matrix)
    {
        for(int i = matrix.length - 1 ; i >= 0 ; i--)
        {
            int num = matrix[i][0], j = 0, tempI = i;
            
            while(tempI < matrix.length && j < matrix[0].length)
            {
                if(matrix[tempI][j] != num)
                    return false;
                
                tempI++;
                j++;
            }
        }
        
        for(int j = 1 ; j < matrix[0].length ; j++)
        {
            int num = matrix[0][j], i = 0, tempJ = j;
            
            while(i < matrix.length && tempJ < matrix[0].length)
            {
                if(matrix[i][tempJ] != num)
                    return false;
                
                i++;
                tempJ++;
            }
        }
        
        return true;
    }
}
