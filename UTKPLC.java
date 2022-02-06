import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;

public class UTKPLC
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter ut = new PrintWriter(System.out);
        Scanner scan = new Scanner(System.in);
        char a[] = new char[3];
        for(int i=0;i<3;i++)
        {
            a[i] =(char)br.read();
        }
        char comp[] = new char[2];
        
        for(int i=0;i<2;i++)
        {
            comp[i] =(char)br.read();
        }
        
        char res = ' ';
        
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(a[i] == a[j])
                {
                    res = a[i];
                    break;
                }
            }
        }
        ut.println(res);
        ut.close();
    }
}