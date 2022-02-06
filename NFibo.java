import java.util.Scanner;
class NFibo
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = 1;
		int b = 1;
		
		System.out.println(a+" \n "+b);
		for(int i=0;i<n-2;i++)
		{
			int c = a+b;
			System.out.println(c);
			a=b;
			b=c;
			c = a+b;
		}
	}
}