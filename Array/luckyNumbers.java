import java.util.List;
import java.util.LinkedList;

class Solution
{
    public List<Integer> luckyNumbers(int[][] matrix)
    {
        List<Integer> lucky = new LinkedList<Integer>();
        
        for(int i = 0 ; i < matrix.length ; i++)
        {
            for(int j = 0 ; j < matrix[0].length ; j++)
            {
                int element = matrix[i][j];
                boolean isLucky = true;
                
                // checking the row
                for(int k = 0 ; k < matrix[0].length ; k++)
                    if(matrix[i][k] < element)
                        isLucky = false;
                
                // checking the column
                for(int k = 0 ; k < matrix.length ; k++)
                    if(matrix[k][j] > element)
                        isLucky = false;
                
                if(isLucky)
                    lucky.add(element);
            }
        }
        
        return lucky;
    }
}
