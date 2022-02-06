import java.util.Scanner;
public class mc2
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        n -=1;
        int f = 0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0);
            f++;
        }
        System.out.println(f);
        
    }
    
}