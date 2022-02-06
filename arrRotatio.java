import java.util.Scanner;
public class arrRotatio
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }
        
        int r = scan.nextInt();
        scan.close();
        for(int i=0;i<r;i++)
        {
            int temp,j;
            temp=a[0];  
            for(j=1;j<n;i++)
            {
                a[j]= a[j-1];
                
            }
            a[n-1] = temp;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i] + " ");
        }
    }
}