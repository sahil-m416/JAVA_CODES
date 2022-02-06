import java.util.Scanner;
//import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class arrRotation
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //PrintWriter ut = new PrintWriter(System.out);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Size of array !");
        int n = Integer.parseInt(br.readLine());
        int a[] = new int[n];
        System.out.println("Enter " + n +"elements of array one by one !!");
        for(int i=0;i<n;i++)
        {
            a[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("The rotation number !");
        int r = Integer.parseInt(br.readLine());
        System.out.println("Before Rotation !!");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("After rotation !!");
        for(int i=r;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        for(int i=0;i<r;i++)
        {
            System.out.print(a[i]+" ");
        }
        //ut.close();
    }
}