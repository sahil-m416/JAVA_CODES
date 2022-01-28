import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;

public class LargestElement
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter o = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine());
        int a[] = new int[n];
        int l = 0;
        for(int i=0;i<n;i++)
        {
            a[i] = Integer.parseInt(br.readLine());
            if(a[i] > l)
            {
                l = a[i];
            }
        }
        o.println(l);
        o.close();
    }
    
}