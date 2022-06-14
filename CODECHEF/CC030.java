import java.util.Scanner;

public class CC030 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0)
        {
            int n = scan.nextInt();
            int p = scan.nextInt();
            int x[][] = new int[n][2];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<2;j++)
                {
                    x[i][j] = scan.nextInt();
                }
            }
            int prod = 1;
            int sum = 0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<2;j++)
                {
                    prod *= x[i][j];
                }
                sum += prod;
                prod = 1;
            }
            System.out.println((sum/4)*p);
        }
        scan.close();
    }
}
