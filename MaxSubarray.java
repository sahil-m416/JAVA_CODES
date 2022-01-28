import java.util.Scanner;

public class MaxSubarray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }
        System.out.println(sum(a));
        scan.close();
    }
    static int sum(int a[])
    {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<a.length;i++)
        {
            sum = sum + a[i];
            max = Math.max(max,sum);
            if(sum<0)
            {
                sum = 0;
            }
        }
        return max;
    }
}
