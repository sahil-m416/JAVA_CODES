class BellNumber
{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Bell no of " + i + " is " + bell(i));
        }
    }

    static int bell(int n) {
        int d[][] = new int[n+1][n+1];

        d[0][0] = 1;

        for(int i=1;i<=n;i++)
        {
            d[i][0] = d[i-1][i-1];
            for(int j=1;j<=i;j++)
            {
                d[i][j] = d[i-1][j-1] + d[i][j-1];
            }
        }
        return d[n][0];
    }
}