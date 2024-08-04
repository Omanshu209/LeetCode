import java.util.HashSet;

class Solution
{
    public boolean isValidSudoku(char[][] board)
    {
        HashSet<Character> set;
        
        // Checking the rows
        
        for(char[] row : board)
        {
            set = new HashSet<Character>();
            
            for(int i = 0 ; i < 9 ; i++)
            {
                char ch = row[i];
                
                if(set.contains(ch) && ch != '.')
                    return false;
                
                set.add(ch);
            }
        }
        
        // Checking the columns
        
        for(int i = 0 ; i < 9 ; i++)
        {
            set = new HashSet<Character>();
            
            for(int j = 0 ; j < 9 ; j++)
            {
                char ch = board[j][i];
                
                if(set.contains(ch) && ch != '.')
                    return false;
                
                set.add(ch);
            }
        }
        
        // Checking the sub-boxes
        
        for(int i = 0 ; i <=6 ; i += 3)
        {
            for(int j = 0 ; j <= 6 ; j += 3)
            {
                set = new HashSet<Character>();
                
                for(int k = i ; k < (i + 3) ; k++)
                {
                    for(int l = j ; l < (j + 3) ; l++)
                    {
                        char ch = board[k][l];
                        
                        if(set.contains(ch) && ch != '.')
                            return false;
                        
                        set.add(ch);
                    }
                }
            }
        }
        
        return true;
    }
}
