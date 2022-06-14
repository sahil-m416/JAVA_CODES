
import java.util.ArrayList;

public class BigFactorial {
    static ArrayList<Integer> factorial(int N)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int fact = 1;
        for(int i=1;i<=N;i++)
        {
            fact = fact * i;
        }
        String ans = Integer.toString(fact);
        for(int i=0;i<ans.length();i++)
        {
            list.add(Integer.parseInt(String.valueOf(ans.charAt(i))));
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(factorial(50));
    }
}
