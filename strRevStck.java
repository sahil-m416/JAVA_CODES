import java.util.Stack;
class strRevStck
{
    public static void main(String args[])
    {
        String s = "SAhil is  my name";
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            stack.push(s.charAt(i));
        }
        
        String fin = "";
        for(int i=0;i<s.length();i++)
        {
            fin += stack.pop();
        }
        System.out.println(fin);
    }
}