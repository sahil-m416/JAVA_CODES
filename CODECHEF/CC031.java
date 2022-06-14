import java.util.Scanner;
class CC031
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0)
        {
            int ans = 0;
            int n = scan.nextInt();
            while(n%10 == 0)
            {
                n=n/10;
            }
            if(n%25 == 0)
                ans = 0;
            else
            {
                while(n%25 != 0)
                {
                    n = n/10;
                    if(n%25 ==0)
                    {
                        ans = 0;
                        break;
                    }
                    if(n <=0)
                        ans = -1;
                }
            }
            System.out.println(ans);
        }
        scan.close();
    }
}