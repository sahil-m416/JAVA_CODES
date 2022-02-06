import java.util.Stack;
import java.util.Scanner;
class numRevStck
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        int n = scan.nextInt();
        String s = Integer.toString(n);
        int len = s.length();
        String fin = "";
        for(int i=0;i<len;i++)
        {
            stack.push(s.charAt(i));
        }
        for(int i=0;i<len;i++)
        {
            fin+=stack.pop();
        }
        n = Integer.parseInt(fin);
        System.out.println(n);
    }
}