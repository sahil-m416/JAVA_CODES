public class SpiralTraversal {
    static void printSpiral(int a[][], int n, int m)
    {
        int top = 0, left = 0, down = n-1, right = m-1, dir = 0;

        while(top<=down && left<=right)
        {
            if(dir == 0)
            {
                for(int i=top;i<=right;i++)
                    System.out.print(a[top][i]+" ");
                top++;
            }
            else
            if(dir == 1)
            {
                for(int i=top;i<=down;i++)
                    System.out.print(a[i][right]+" ");
                right--;
            }
            else
            if(dir == 2)
            {
                for(int i=right;i>=left;i--)
                    System.out.print(a[down][i]+" ");
                down--;
            }
            else
            if(dir == 3)
            {
                for(int i=down;i>=top;i--)
                    System.out.print(a[i][left]+" ");
                    left++;
            }
            dir = (dir+1)%4;
        }
    }
    public static void main(String[] args) {
        int a[][] = {
            {4,5,6},
            {7,8,9},
            {10,11,12}
        };
        int n = 3;
        int m = 3;
        printSpiral(a, n, m);
    }
}
