import java.util.Stack;
public class getMinFromStack
{
    public static void main(String args[], Stack<Integer> stack2)
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(2);
        stack.push(9);
        stack.push(1);
        Integer min = stack.peek();
        for(Integer v:stack)
        {
            if(v<min)
            {
                min = v;
            }
        }
        System.out.println(min);
    }
}