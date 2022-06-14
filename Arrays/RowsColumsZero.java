public class RowsColumsZero {
    static void doZero(int a[][], int n, int m)
    {
        boolean rowFlag = false;
        boolean colFlag = false;

        for(int i=0;i<m;i++)
            if(a[0][i] == 0)
                colFlag = true;
        
        for(int i=0;i<n;i++)
            if(a[i][0] == 0)
                rowFlag = true;

        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(a[i][j] == 0)
                {
                    a[i][0] = 0;
                    a[0][j] = 0;
                }
            }
        }

        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(a[i][0] == 0 || a[0][j] == 0)
                    a[i][j] = 0;
            }
        }

        if(rowFlag)
            for(int i=0;i<n;i++)
                a[i][0] = 0;

        if(colFlag)
            for(int i=0;i<m;i++)
                a[0][i] = 0;
    }

    static void printArr(int a[][], int n, int m)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int a[][] = {
            {1,2,3},
            {0,1,0},
            {0,8,9}
        };
        int n = 3;
        int m = 3;
        printArr(a, n, m);
        System.out.println();
        doZero(a, n, m);
        printArr(a, n, m);
    }
}
