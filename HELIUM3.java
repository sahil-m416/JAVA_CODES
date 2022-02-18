import java.util.Scanner;

public class HELIUM3 {
    static String solve(int a, int b, int x, int y)
    {
      String s =   (a*b) <= (x*y) ?  "yes" :  "NO";
      return s;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0)
        {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();
            System.out.println(solve(a, b, x, y));
        }
        scan.close();
    }
}
