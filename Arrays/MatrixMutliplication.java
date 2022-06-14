import java.util.Scanner;

class MatrixMutltiplication {
    static void multiply(int rowo, int colo, int rowt, int colt, int a[][], int b[][])
    {
        // if(rowo != colt)
        //     System.out.println("Matrix Multiplication not possible");
        // else 
        // {
            int c[][] = new int[rowo][colt];
            for(int i=0;i<rowo;i++)
            {
                for(int j=0;j<colt;j++)
                {
                    for(int k=0;k<rowt;k++)
                    {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            printMat(c, rowo, colt);
        }
    // }

    static void printMat(int a[][], int row, int col)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0)
        {
            int rowo = scan.nextInt();
            int colo = scan.nextInt();

            int A[][] = new int[rowo][colo];
            for(int i=0;i<rowo;i++)
            {
                for(int j=0;j<colo;j++)
                {
                    A[i][j] = scan.nextInt();
                }
            }
            int rowt = scan.nextInt();
            int colt = scan.nextInt();

            int B[][] = new int[rowt][colt];

            for(int i=0;i<rowt;i++)
            {
                for(int j=0;j<colt;j++)
                {
                    B[i][j] = scan.nextInt();
                }
            }
            multiply(rowo, colo, rowt, colt, A, B);
        }
        scan.close();
    }
}