import java.util.Scanner;
public class LeftRightIndex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }
        int x = scan.nextInt();
        LeftRight(a,n,x);
        scan.close();
    }
    
    public static void LeftRight(int a[], int n, int x)
    {
        int left  = 0, right = 0;
        for(int i=0;i<n;i++)
        {
            if(a[i] == x )
            {
                left = i;
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            if(a[i] == x)
            right = i;
        }
        System.out.println(left+" "+right);
    }
}
