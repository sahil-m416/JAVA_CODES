package Strings;

import java.util.Stack;

class CountReversal
{
    static int count(String s)
    {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '}')
            {
                if(stack.isEmpty())
                    stack.push(s.charAt(i));
                else
                {
                    if(stack.peek() != s.charAt(i))
                        stack.pop();
                    else
                        stack.push(s.charAt(i));
                }
            }
            else
                stack.push(s.charAt(i));
        }

        if(stack.size()%2 != 0)
            return -1;
        int slow = 0;
        int fast = 0;
        while(!stack.isEmpty())
        {
            if(stack.peek()== '{')
                slow++;
            else 
                fast++;
            stack.pop();
        }
        return (slow%2) + (fast%2) + (slow/2) + (fast/2);
    }
    public static void main(String[] args) {
        System.out.println(count("}{{}}{{{"));
    }
}