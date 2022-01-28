import java.io.IOException;
import java.util.Scanner;

class FRIMEET
{
    public static void main(String args[])throws IOException
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int z=0;z<t;z++)
        {
            int x1 = scan.nextInt();
            int x2 = scan.nextInt();
            scan.close();
            String fin = "NO";
            while(x2<=x1)
            {
                if(x1 == x2)
                {
                    fin = "YES";
                    break;
                }
                x1=x1+1;
                x2= x2+2;
            }
            System.out.println(fin);
        }
    }
}