import java.util.Scanner;
public class parity
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        long s = scan.nextLong();
        
        System.out.println(parit(s));
    }
    
    public static short parit(long x)
    {
        short result = 0;
        while(x!=0)
        {
            result ^= (x& 1);
            x>>>=1;
        }
        return result;
    }
}