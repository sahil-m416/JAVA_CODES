public class CounterDiagonal {
    static void diagTraveres(int a[][], int n)
    {
        for(int i=0;i<2*n-1;i++)
        {
            int x = (i<n) ? 0 : i-n+1;
            for(int j=x;j<=i-x;j++)
                System.out.print(a[j][i-j] + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int a[][] = { 
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        diagTraveres(a, 3);
    }
}
