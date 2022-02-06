import java.util.Scanner;
public class Fibonacci 
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(fibo(n));
        scan.close();
    }

    static int fibo(int n) {
        int fib[] = new int[n+1];
        fib[0] = 0;
        fib[1] = 1;
        for(int i=2;i<=n;i++)
        {
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n];
    }
}