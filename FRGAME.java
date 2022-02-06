import java.util.Scanner;
public class FRGAME
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0)
        {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();
            if(a<b)
            {
                a= a+c;
            }
            else
            if(a>b || a==b)
            {
                b=b+c;
            }
            
            if(a<b)
            {
                a= a+d;
            }
            else
            if(a>b || a==b)
            {
                b=b+d;
            }
            
            if(a>b || a==b)
            {
                System.out.println("N");
            }
            else
            {
                System.out.println("S");
            }
        }
    }
}