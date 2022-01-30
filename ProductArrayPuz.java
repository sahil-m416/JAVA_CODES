import java.util.Scanner;

public class ProductArrayPuz
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0)
        {
            int n = scan.nextInt();
            int a[] = new int [n];
            for(int i=0;i<n;i++)
            {
                a[i] = scan.nextInt();
            }
             a=puzzle(a,n);
             for(int i=0;i<n;i++)
            {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
        scan.close();
    }

    public static int[] puzzle(int a[], int n)
    {
        int fin[] = new int[n];
        int count = 0;
        int prod = 1;
        for(int i=0;i<n;i++)
        {
           if(a[i] !=0 )
            prod = prod * a[i];
            else 
             count++;
        }
        for(int i=0;i<n;i++)
        {
            if(a[i] == 0 && count == 1)
                fin[i] =   prod;
            else if(a[i] == 0 && count > 1 )
                fin[i] = 0;
            else if(a[i] != 0 && count >=1 )
                fin[i] = 0;
            else 
                fin[i] = prod/a[i];
        }
        return fin;
    }
}