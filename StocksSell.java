import java.util.Scanner;

public class StocksSell {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }
        System.out.println(stocks(a));
        scan.close();
    }

    static int stocks(int a[])
    {
        int min = 0;
        int max = 0;
        int min_index = 0;
        for(int i=0;i<a.length;i++)
        {
            if(min > a[i])
            {
                min = a[i];
                min_index = i;
            }
        }
        System.out.println(min);
        
        for(int i=min_index;i<a.length-1;i++)
        {
            if(a[i] > a[i+1])
            {
                max = a[i];
            }
        }
        System.out.println(max);
        return max- min;
    }
}
