import java.util.Scanner;

public class BitonicPoint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        int bitonic = 0;
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }
        scan.close();
        for(int i=0;i<n-1;i++)
        {
            if(a[i] > a[i+1])
            {
                bitonic = a[i];
                break;
            }            
        }
        System.out.println(bitonic);
    }
}
