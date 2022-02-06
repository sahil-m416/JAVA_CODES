
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

class oddEven
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(br.readLine());
        if(n%2==0)
        {
            pw.println("Even");
        }
        else
            pw.println("Odd");
        pw.close();
        }
    }
