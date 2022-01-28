import java.util.Scanner;
import java.util.Arrays;
public class nextGreaterArray
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        int fin = 0;
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }
        
        Arrays.sort(a);
        for(int i=n-1;i>0;i--)
        {
            if(a[i] != a[i-1])
            {
                fin = a[i-1];
                break;
            }
        }
        System.out.println(fin);
        
    }
}