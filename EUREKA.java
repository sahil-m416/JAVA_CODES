import java.util.Scanner;

public class EUREKA
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- > 0)
        {
            double x = scan.nextInt();
            double ans = Math.pow((0.143 * x), x);
            if(ans - Math.floor(ans) < 0.5)
            {
                System.out.println(Math.round(Math.floor(ans)));
            }
            else{
                System.out.println(Math.round(Math.floor(ans)) + 1);
            }
        }
        scan.close();
    }
}