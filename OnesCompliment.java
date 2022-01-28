import java.util.Scanner;
public class OnesCompliment
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		String s = scan.nextLine();
		char a[] = new char[n];
		 a = s.toCharArray();
		for(int i=0;i<n;i++)
		{
			if(a[i] == '1')
			{
				a[i] = '0';
			}
			else
			{
				a[i] = '1';
			}

		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]);
		}

	}
}