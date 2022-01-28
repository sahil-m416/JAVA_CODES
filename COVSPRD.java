import java.util.Scanner;
class COVSPRD
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0)
		{
			long n = scan.nextLong();
			long d = scan.nextLong();
			long sum = 1;
			for(long i=1;i<=d;i++)
			{
				if(i<=10)
				{
					sum = sum*2;
					if(sum> n )
					{
						sum = n;
						break;
					}
				}
				else 
				{
					sum = sum*3;
					if(sum > n)
					{
						sum = n;
						break;
					}
				}
			}
			System.out.println(sum);
		}
	}
}