import java.util.Arrays;
import java.util.Scanner;

public class CountTriplets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }
        System.out.println(triplets(a,n));
        scan.close();
    }
    static int triplets(int a[], int n)
    {

       int count = 0;
       Arrays.sort(a);
       for(int i=0;i<a.length;i++)
       {
           for(int j=i+1, k=j+1; j<a.length && k<a.length;j++)
           {
               if(a[i] + a[j] < a[k])
               {
                   continue;
               }
               else{
                   while(k<a.length && a[i]+a[j] >= a[k])
                   {
                       if(a[i] + a[j] == a[k])
                       {
                           count++;
                       }
                       k++;
                   }
               }
           }
       }
        return count;
    }
}
