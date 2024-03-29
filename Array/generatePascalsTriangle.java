import java.util.List;
import java.util.LinkedList;

class Solution
{
    public List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> triangle = new LinkedList<>();

        for(int i = 0 ; i < numRows ; i++)
        {
            List<Integer> row = new LinkedList<>();

            for(int j = 0 ; j <= i ; j++)
            {
                if(j == 0 || j == i)
                {
                    row.add(1);
                    continue;
                }
                
                row.add(triangle.get(i - 1).get(j) + triangle.get(i - 1).get(j - 1));
            }

            triangle.add(row);
        }

        return triangle;
    }
}
