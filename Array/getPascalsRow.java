import java.util.List;
import java.util.LinkedList;

class Solution
{
    public List<Integer> getRow(int rowIndex)
    {
        List<Integer> row = new LinkedList<>(), prevRow = new LinkedList<>();

        for(int i = 0 ; i <= rowIndex ; i++)
        {
            row = new LinkedList<>();

            for(int j = 0 ; j <= i ; j++)
            {
                if(j == 0 || j == i)
                {
                    row.add(1);
                    continue;
                }

                row.add(prevRow.get(j) + prevRow.get(j - 1));
            }

            prevRow = row;
        }

        return row;
    }
}
