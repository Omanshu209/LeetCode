import java.util.LinkedList;

class Solution
{
    public int partitionString(String s)
    {
        LinkedList<String> subs = new LinkedList<>();
        int k = 0;

        subs.add("");

        for(int i = 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i);
            boolean isUnique = true;

            for(int j = 0 ; j < subs.get(k).length() ; j++)
                if(ch == subs.get(k).charAt(j))
                    isUnique = false;
            
            if(isUnique)
                subs.set(k, subs.get(k) + ch);
            
            else
            {
                subs.add(Character.toString(ch));
                k++;
            }
        }
        
        return k + 1;
    }
}
