import java.util.Scanner;
public class CHEF10102
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i=0;i<t;i++)
        {
            int n = scan.nextInt();
            scan.nextLine();
            String s = scan.nextLine();
            int ones = 0;
            int zeroes = 0;
            int fin = 0;
            for(int j=0;j<n;j++)
            {
                if(s.charAt(j) == '0')
                {
                    zeroes++;
                }
                else 
                {
                    ones++;
                }
            }
            fin = Math.max(fin, Math.min(zeroes,ones)-1);
            System.out.println(fin);
        }
    }
}