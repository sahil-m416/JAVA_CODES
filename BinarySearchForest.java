import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchForest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        scan.close();
        Arrays.sort(a);
        int low = 0;
        int high = a[n-1];
        int fin = 0;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            int collected = woodCollected(a, k, n);
            if(collected == k)
            {
                fin = mid;
            }
            if(collected>k)
            {
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        System.out.println(fin);
    }
    static int woodCollected(int a[], int k, int n)
    {
        int sum = 0;
        for(int i=n-1;i>=0;i--)
        {
            if(a[i] - k <=0)
            {
                break;
            }
            sum = sum+a[i];
        }
        return sum;
    }
}
