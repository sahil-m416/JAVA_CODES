import java.util.Scanner;
public class TrailingZeroes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(zeroes(n));
        scan.close();
    }
    static int zeroes(int n) 
    {
       int j = 5;
       int ans = 0;
       while(j<=n) {
           ans +=n/j;
           j=j*5;
       }
       return ans;
    }
}
