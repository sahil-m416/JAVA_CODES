import java.util.Stack;
import java.util.HashMap;
public class NextGreaterRight {
    static void nextGreater(int a[])
    {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        stack.push(a[0]);
        for(int i=1;i<a.length;i++)
        {
            while(!stack.empty() && stack.peek() < a[i])
            {
                map.put(stack.peek(), a[i]);
                stack.pop();
            }
            stack.push(a[i]);
        }

        while(!stack.empty())
        {
            map.put(stack.peek(), -1);
            stack.pop();
        }
        for(int i=0;i<a.length;i++)
            System.out.print(map.get(a[i]));
    }
    public static void main(String[] args) {
        int a[] = {3,2,6,1,5};
        nextGreater(a);
    }
}
