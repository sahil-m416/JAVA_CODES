package BackTracking;

public class NQueens {
    public static int n = 4;
    static boolean isSafe(int board[][], int r, int c)
    {
        int i, j;
        for(i=0;i<r;i++)
        {
            if(board[i][c] == 1)
                return false;
        }
        i=r-1;
        j=c-1;
        while(i>=0 && j>=0)
        {
            if(board[i][j] == 1)
                return false;
            i--;
            j--;
        }
        i=r=1;
        j=c+1;
        while(i>=0 && j<n)
        {
            if(board[i][j] == 1)
                return false;
            i--;
            j++;
        }
        return true;
    }

    static boolean solveNQueens(int board[][], int r)
    {
        if(r==n)
            return true;
        for(int i=0;i<n;i++)
        {
            if(isSafe(board, r, i))
            {
                board[r][i] = 1;
                if(solveNQueens(board, r+1))
                    return true;
                board[r][i] = 0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int a [][] = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};

        System.out.println(solveNQueens(a, 0));
    }
}