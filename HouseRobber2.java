import java.util.Scanner;

public class HouseRobber2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = scan.nextInt();
        }
        scan.close();
        System.out.println(rob(a,n));
    }
    static int rob2(int a[], int n) 
    {
        int temp[] = new int[n-1];
        for(int i=0;i<n-1;i++)
        {
            temp[i] = a[i];
        }
        ans1 = rob(temp, temp.length);
        for(int i=1;i<n;i++)
        {
            temp[i-1] = a[i];
        }
        ans2 = rob(temp, temp.length);
        return Math.max(ans1, ans2);
    }
    static int rob(int a[], int n) {
        int dp[] = new int[n];
        if(n==0) return a[0];
        dp[1] = Math.max(a[0], a[1]);
        for(int i=2;i<n;i++)
        {
            dp[i] = Math.max(a[i] + dp[i-2], dp[i-1]);
        }
        return dp[n-1];
    }
}
