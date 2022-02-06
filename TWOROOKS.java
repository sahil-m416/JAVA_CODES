import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
// import java.util.Scanner;

class TWOROOKS
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++)
        {
            int x1 = Integer.parseInt(br.readLine());
            int y1 = Integer.parseInt(br.readLine());
            int x2 = Integer.parseInt(br.readLine());
            int y2 = Integer.parseInt(br.readLine());
            
            String fin = "NO";
            if(x1 == x2 || y1 == y2) 
            {
                fin = "YES";
            }
            
            System.out.println(fin);
        }
    }
}
