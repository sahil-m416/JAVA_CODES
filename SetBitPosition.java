import java.util.Scanner;

class SetBitPosition
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int fin = 0;
        if(n==0)
        {
            fin = -1;
        }
        else if((n&(n-1)) !=0)
        {
            fin = -1;
        }
        else
        {
            fin = (int)(Math.log(n)/Math.log(2));
        }
        System.out.println(fin);
    }
}