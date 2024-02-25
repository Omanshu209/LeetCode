import java.util.List;
import java.util.LinkedList;
import java.util.HashMap;

class Solution
{
    private static final HashMap<Character, String> map = new HashMap<Character, String>();

    static
    {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }

    private static List<String> combinations(String digits, int index, List<String> list, String combination)
    {
        if(index == digits.length())
        {
            list.add(combination);
            return list;
        }
        
        String characters = map.get(digits.charAt(index));
        for(int i = 0 ; i < characters.length() ; i++)
            combinations(digits, index + 1, list, combination + characters.charAt(i));

        return list;
    }

    public List<String> letterCombinations(String digits)
    {
        List<String> list = new LinkedList<String>();

        if(digits.length() == 0)
            return list;

        return combinations(digits, 0, list, "");
    }
}
