import java.util.Queue;
import java.util.LinkedList;

class Solution
{
    private static int calc(String s)
    {
    	int sol = 0, num;
    	boolean add = true;
    	String str = "", element;
    	Queue<String> q = new LinkedList<>();
    	
    	for(char c : s.toCharArray())
    	{
    		switch(c)
    		{
    			case '+':
    				if(str.length() != 0)
    				{
    					q.add(str);
    					str = "";
    				}
    				
    				q.add("+");
    				break;
    			
    			case '-':
    				if(str.length() != 0)
    				{
    					q.add(str);
    					str = "";
    				}
    				
    				q.add("-");
    				break;
    			
    			default:
    				str += c;
    				break;
    		}
    	}
    	if(str.length() != 0)
    		q.add(str);
    	
    	while(!q.isEmpty())
    	{
    		element = q.remove();
    		
    		switch(element)
    		{
    			case "+":
    				add = true;
    				break;
    			
    			case "-":
    				if(!q.isEmpty())
    				{
    					if(q.peek().equals("-"))
    					{
    						add = true;
    						q.remove();
    					}
    				
    					else
    						add = false;
    				}
    				
    				break;
    			
    			default:
    				num = Integer.parseInt(element);
    				sol = add ? sol + num : sol - num;
    				break;
    		}
    	}
    	
    	return sol;
    }
    
    private static boolean isDigit(String s)
    {
    	for(char c : s.toCharArray())
    		if(c == '(' || c == ')')
    			return false;
    	
    	return true;
    }
    
    public static int calculate(String s)
    {
        for(int i = 0 ; i < s.length() ; i++)
        {
        	if(s.charAt(i) == ' ')
            {
        		s = s.substring(0, i) + s.substring(i + 1);
                i--;
            }
        }
                
        int start;
        while(!isDigit(s))
        {
        	start = 0;
        	
        	for(int i = 0 ; i < s.length() ; i++)
        	{
        		if(s.charAt(i) == '(')
        			start = i;
        		else if (s.charAt(i) == ')')
        		{
        			s = s.substring(0, start) + calc(s.substring(start + 1, i)) + s.substring(i + 1);
        			break;
        		}
        	}
        }
        
        return calc(s);
    }
}
