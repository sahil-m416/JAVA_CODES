import java.util.Scanner;

public class JumpGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }
        System.out.println(jump(a));
        scan.close();   
    }

    static boolean jump(int nums[])
    {
        boolean dp[] = new boolean[nums.length];
        dp[nums.length-1] = true;
        for(int i=nums.length-2;i>=0;i--)
        {
            for(int k=0;k<=nums[i];k++)
            {
                if(dp[i+k] == true)
                {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[0];
    }
}
