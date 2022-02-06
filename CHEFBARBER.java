import java.util.Scanner;

public class CHEFBARBER {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- > 0 )
        {
            int n = scan.nextInt();
            int m = scan.nextInt();
            System.out.println(n*m);
        }
        scan.close();
    }
}
