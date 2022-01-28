import java.util.Scanner;

class StringDotRev
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(rev(s));
        scan.close();
    }
    static String rev(String s)
    {
        String fin = "";
        int n = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '.')
            {
                n++;
            }
        }
        String revarray[] = new String[n+1];
        for(int i=0;i<n;i++)
        {
            int j = i+1;
            
            if(s.charAt(j) == '.')
            {
                revarray[i] = s.substring(i, j);
            }
            else{
                j++;
            }
            
        }
        for(int i=0;i<revarray.length;i++)
        {
            System.out.println(revarray[i] + " ");
        }
        return fin;
    }
}