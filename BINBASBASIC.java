import java.util.Scanner;

public class BINBASBASIC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        
        while(t-->0)
        {
           
            int n = scan.nextInt();
            scan.nextLine();
            String s = scan.nextLine();
            int k = scan.nextInt();
            char c[] = s.toCharArray();
            for(int i=0;i<k;i++)
            {
                    if(c[i] == '0')
                    {
                        c[i] = '1';
                    }
                    else
                    {
                        c[i] = '0';
                    }
            }
            System.out.println(checkPalindrome(c, k));
        }
        scan.close();
    }
    public static String checkPalindrome(char c[], int k)
    {
        if(k == 0) return "NO";
        int j = c.length-1;
        for(int i=0;i<c.length/2;i++)
        {
            if(c[i] != c[j--])
            {
                return "NO";
            }
        }
        return "YES";
    }
}
