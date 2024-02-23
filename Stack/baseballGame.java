import java.util.Stack;

class Solution
{
    public int calPoints(String[] operations)
    {
        Stack<Integer> stack = new Stack<Integer>();
        int prevNum, sum;

        for(String operation : operations)
        {
            if(!(operation.equals("C") || operation.equals("D") || operation.equals("+")))
            {
                stack.push(Integer.parseInt(operation));
                continue;
            }

            switch(operation)
            {
                case "C":
                    stack.pop();
                    break;
                
                case "D":
                    stack.push(stack.peek() * 2);
                    break;
                
                case "+":
                    prevNum = stack.peek();
                    stack.pop();
                    sum = prevNum + stack.peek();
                    stack.push(prevNum);
                    stack.push(sum);
                    break;
            }
        }

        sum = 0;
        while(!stack.isEmpty())
            sum += stack.pop(); // sum += stack.peek(); stack.pop();
        
        return sum;
    }
}
