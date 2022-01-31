import java.util.Scanner;

public class CoinsGeekLand {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[][] = new int[n][n];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j] = scan.nextInt();
            }
        }
        int k = scan.nextInt();
        scan.close();
        int sum=0;
        
       
            for(int i=0;i<n-k+1;i++)
            {
                for(int j=0;j<n-k+1;j++)
                {
                    int temp = 0;
                   for(int p=i;p<i+k;p++)
                   {
                       for(int q=j;q<j+k;q++)
                       {
                           temp = temp+a[p][q];
                       }
                   }
                    sum = Math.max(temp, sum);
                }
            }
            System.out.println(sum);
        
    }  
}