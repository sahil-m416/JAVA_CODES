import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

class MUSICHAIR
{
    public static void main(String args[])throws IOException
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int z=0;z<t;z++)
        {
            int n = scan.nextInt();
            int k = 0;
            int init = n-1;
            for(int i=1;i<=init;i++)
            {
                if(init%i==0)
                {
                    k++;
                }
            }
            System.out.println(k);
        }
    }
}