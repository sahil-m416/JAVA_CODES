import java.util.Scanner;
class CHEFFAV
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0)
        {
            int n = scan.nextInt();
            scan.nextLine();
            String s = scan.nextLine();
            int indexofo = 0;
            int indexofh = 0;
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i) == 'o' )
                {
                    indexofo = i;
                }
                if(s.charAt(i) == 'h')
                {
                    indexofh = i;
                    break;
                }
            }
            if(indexofo < indexofh)
            {
                System.out.println("AC");
            }
            else
            {
                System.out.println("WA");
            }
        }
    }
}