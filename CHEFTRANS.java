import java.util.Scanner;
public class CHEFTRANS
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i=0;i<t;i++)
        {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int z = scan.nextInt();
            
            if((x+y) > z )
            {
                System.out.println("TRAIN");
            }
            if((x+y) < z)
            {
                System.out.println("PLANEBUS");
            }
            if((x+y) == z)
            {
                System.out.println("EQUAl");
            }
        }
    }
}