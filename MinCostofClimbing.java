import java.util.Scanner;

public class MinCostofClimbing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int cost[] = new int[n];
        for(int i=0;i<n;i++)
        {
            cost[i] = scan.nextInt();
        }
        System.out.println(minCostofClimbingStairs(cost, n));
        scan.close();
    }
    static int minCostofClimbingStairs(int cost[], int n) {
        int a= cost[0];
        int b = cost[1];
        for(int i=2;i<cost.length;i++)
        {
            int c = cost[i] + Math.min(a, b);
            a=b;
            b=c;
        }
        return Math.min(a, b);
    }
}
