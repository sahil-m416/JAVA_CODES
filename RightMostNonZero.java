import java.util.Scanner;

public class RightMostNonZero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        int prod = 1;
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
            prod = prod*a[i];
        }
        String p = Integer.toString(prod);
        for(int i=p.length()-1;i>=0;i--)
        {
            if(p.charAt(i)!='0')
            {
                System.out.println(Character.getNumericValue(p.charAt(i)));
                break;
            }
        }
        scan.close();
        
    }   
}
