import java.util.Scanner;
import java.util.Stack;

public class BalancedParantheses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(valid(s));
        scan.close();
    }
    static boolean valid(String s)
    {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            int x = s.charAt(i);
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                stack.push(s.charAt(i));

            char check;
            switch(x){
                case ')':
                    check = stack.pop();
                    if(check == '{' || check == '[')
                    return false;
                    break;
                case '}':
                    check = stack.pop();
                    if(check == '[' || check == '(')
                    return false;
                    break;
                case ']':
                    check = stack.pop();
                    if(check == '(' || check == '{')
                    return false;
                    break;
            }
            

        }

      
        return stack.isEmpty();
    }
}
