import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleFraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int denom = scan.nextInt();
        System.out.println(sraction(num, denom));
        scan.close();
    }
    static String sraction(int num, int denom)
    {
        StringBuilder res = new StringBuilder("");
        long n = Math.abs(num);
        long d = Math.abs(denom);
        res.append(n/d);

        if(n%d == 0) 
            return res.toString();
        
        Map<Long, Integer> map = new HashMap<>();
        n%=d;
        res.append('.');
        map.put(n,res.length());
        while(n!=0)
        {
            n=n*10;
            res.append(n/d);
            n%=d;
            if(map.containsKey(n))
            {
                int index = map.get(n);
                res.insert(index, "(");
                res.append(")");
                break;
            } else {
                map.put(n, res.length());
            }
        }
        return res.toString();
    }
}
