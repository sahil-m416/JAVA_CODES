
import java.util.Arrays;

public class AveragePeople {
    static int avg(int a[][], int n, int m )
    {
        int fin[] = new int[n];
        Arrays.fill(fin, 0);
        for(int i=0;i<m;i++)
        {
            int low = a[i][0];
            int high = a[i][1];
            int toFill = a[i][2];
            fillNow(fin, low, high, toFill);
        }
        return sum(fin)/fin.length;
    }

    static void fillNow(int fin[], int i, int j, int x)
    {
        for(int k=i-1;k<j;k++)
            fin[k] = fin[k] + x;
    }
    static int sum(int a[])
    {
        int s = 0;
        for(int z : a)
            s += z;
        return s;
    }
    public static void main(String[] args) {
        int n = 5;
        int m = 3;
        int a[][] = {
            {2,4,5},
            {1,3,2},
            {3,5,3}
        };
        System.out.println(avg(a, n, m));
    }
}
