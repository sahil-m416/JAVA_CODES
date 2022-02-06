import java.util.Scanner;

class ClimbingStairs
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(ans(n));
        scan.close();
    }

    static int ans(int n)
    {
        if(n==0) return 0;
        if(n==1) return 1;
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=n;i++)
        {
           dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}