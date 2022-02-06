import java.util.Arrays;
import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }
        int x = scan.nextInt();
        scan.close();
        Arrays.sort(a);
        System.out.println(Arrays.asList(a));
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n-x;i++)
        {
            int temp = a[i+x-1] - a[i];
            min = Math.min(min, temp);
        }
        System.out.println(min);
    }
}
