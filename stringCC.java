import java.util.Scanner;
import java.util.Locale;
public class stringCC
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String a[] = new String[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextLine();
        }
        for(int i = 0;i<n;i++)
        {
            String t = a[i];
            
            System.out.print(t.substring(0,1).toUpperCase()+t.substring(1).toLowerCase() + " ");
        }
        
    }
}