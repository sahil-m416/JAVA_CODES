import java.util.Scanner;

public class CEIL {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0)
        {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = a-b;
            System.out.println(c-1);
        }
        scan.close();
    }
}
