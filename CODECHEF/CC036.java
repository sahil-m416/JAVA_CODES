import java.util.Arrays;
import java.util.Scanner;

class CC036
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0)
        {
            int n = scan.nextInt();
            int s[] = new int[2*n];
            String fin = "NO";
            for(int i=0;i<2*n;i++)
                s[i] = scan.nextInt();
            Arrays.sort(s);
            for(int i=0;i<(n*2)-3;i++)
            {
                if(s[i]-s[i+1] == s[i+2]-s[i+3])
                    fin = "YES";
            }
            System.out.println(fin);
        }   
        scan.close();
    }
}