import java.util.Scanner;

public class AVGOF3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- >0)
        {
            int x = scan.nextInt();
            int a1 = ((3*x) + 1)/2;
            int a2 = (a1+1)/2;
            int a3 = (a2+1)/2;
            if(a1+a2+a3 > 3*x)
            {
                a3--;
            }

            if(a1+a2+a3 < 3*x)
            {
                a1++;
            }
            System.out.println(a1);
            System.out.println(a2);
            System.out.println(a3);
            
        }

        scan.close();
    }
}
