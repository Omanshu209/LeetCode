import java.util.Stack;

class Solution
{
    public int calculate(String s)
    {
        for(int i = 0 ; i < s.length() ; i++)
        {
        	if(s.charAt(i) == ' ')
        	{
        		s = s.substring(0, i) + s.substring(i + 1);
        		i--;
        	}
        }
        
        Stack<String> stack = new Stack<>();
        String num = "";
        boolean mul = false, div = false;

        for(char c : s.toCharArray())
        {
            switch(c)
            {
                case '+':
                	if(mul)
                	{
                		stack.add(Integer.toString(Integer.parseInt(num) * Integer.parseInt(stack.pop())));
                		mul = false;
                	}
                	
                	else if(div)
                	{
                		stack.add(Integer.toString(Integer.parseInt(stack.pop()) / Integer.parseInt(num)));
                		div = false;
                	}
                
                    else if(num.length() != 0)
                        stack.add(num);
                    
                    num = "";
                    stack.add("+");
                    break;
                
                case '-':
                	if(mul)
                	{
                		stack.add(Integer.toString(Integer.parseInt(num) * Integer.parseInt(stack.pop())));
                		mul = false;
                	}
                	
                	else if(div)
                	{
                		stack.add(Integer.toString(Integer.parseInt(stack.pop()) / Integer.parseInt(num)));
                		div = false;
                	}
                	
                	else if(num.length() != 0)
                        stack.add(num);
                    
                    num = "";
                    stack.add("-");
                    break;
                
                case '*':
                	if(mul)
                		stack.add(Integer.toString(Integer.parseInt(num) * Integer.parseInt(stack.pop())));
                	
                	else if(div)
                	{
                		stack.add(Integer.toString(Integer.parseInt(stack.pop()) / Integer.parseInt(num)));
                		div = false;
                	}
                	
                	else if(num.length() != 0)
                		stack.add(num);
                	
                	num = "";
                	mul = true;
                	div = false;
                	break;
                
                case '/':
                	if(mul)
                	{
                		stack.add(Integer.toString(Integer.parseInt(num) * Integer.parseInt(stack.pop())));
                		mul = false;
                	}
                	
                	else if(div)
                		stack.add(Integer.toString(Integer.parseInt(stack.pop()) / Integer.parseInt(num)));
                
                	else if(num.length() != 0)
                		stack.add(num);
                	
                	num = "";
                	div = true;
                	mul = false;
                	break;
                
                default:
                	num += c;
                	break;
            }
        }

        if(mul)
            stack.add(Integer.toString(Integer.parseInt(num) * Integer.parseInt(stack.pop())));
        else if(div)
        	stack.add(Integer.toString(Integer.parseInt(stack.pop()) / Integer.parseInt(num)));
        else if(num.length() != 0)
        	stack.add(num);
        
        int sol = 0;
        String element;
        boolean add = true;
        
        Stack<String> newStack = new Stack<>();
        while(!stack.isEmpty())
        	newStack.add(stack.pop());
        stack = newStack;
        stack.add("+");
        
        while(!stack.isEmpty())
        {
        	element = stack.pop();
        	System.out.println(element);

        	switch(element)
        	{
        		case "+":
        			add = true;
        			break;
        		
        		case "-": 
                    add = false;
        			break;
        		
        		default:
        			sol = add ? sol + Integer.parseInt(element) : sol - Integer.parseInt(element);
        			break;
        	}
        }
        
        return sol;
    }
}
