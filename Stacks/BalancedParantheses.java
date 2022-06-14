package Stacks;


import java.util.Stack;

public class BalancedParantheses {
    static boolean isBalanced(String str)
    {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{')
                stack.push(str.charAt(i));
            else
            if(!stack.isEmpty())
            {
                if(stack.peek() == '(' || stack.peek() == '{' || stack.peek() == '[')
                {
                    char x = stack.pop();
                    if(str.charAt(i) == ')' && x!= '(')
                        return false;
                    if(str.charAt(i) == '}' && x!='{')
                        return false;
                    if(str.charAt(i) == ']' && x != '[')
                        return false;
                }
                else
                    return false;
            }
        }
        if(!stack.isEmpty())
            return false;
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isBalanced("(((Q+B))"));
    }
}
