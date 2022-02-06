import java.util.Scanner;

public class Tribonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(tribo(n));
        scan.close();
    }

    static int tribo(int n)
    {
        int trib[] = new int[n+2];
        trib[0] = 0;
        trib[1] = 0;
        trib[2] = 1;
        for(int i=3;i<=n;i++)
        {
            trib[i] = trib[i-1] + trib[i-2] + trib[i-3];
        }

        return trib[n-1];
    }
}
