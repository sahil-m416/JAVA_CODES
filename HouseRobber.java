import java.util.Scanner;

class HouseRobber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = scan.nextInt();
        }
        System.out.println(rob(a,n));
        scan.close();
    }

    static int rob(int a[], int n) {
       int dp[] = new int[n];
        dp[0] = a[0];
        if(n==1) {
            return dp[0];
        }
        dp[1] = Math.max(dp[0], dp[1]);
        for(int i=2;i<n;i++)
        {
            dp[i] = Math.max(a[i] + dp[i-2], dp[i-1]);
        }
        return dp[n-1];
    }
}