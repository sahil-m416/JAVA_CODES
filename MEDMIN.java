import java.util.Scanner;
import java.util.Arrays;
class MEDMIN
{ 
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int z=0;z<t;z++)
        {
            int n = scan.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++)
            {
                a[i] = scan.nextInt();
            }
            Arrays.sort(a);
            int x = ((n-1)/2)-1;
            System.out.println(a[x+1] - a[x]);
        }
    }
}