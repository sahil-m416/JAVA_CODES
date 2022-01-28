import java.util.Scanner;
import java.util.Arrays;
public class GivenScore
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		int table[] = new int[n+1], i;
		Arrays.fill(table,0);
		table[0] = 1;

		for(i=0;i<n;i++)
		{
			a[i] = scan.nextInt();
		}
		for(i=3;i<=n;i++)
		{
			table[i] +=table[i-3];
		}

		for(i=5;i<=n;i++)
		{
			table[i] += table[i-5];
		}

		for(i=10;i<=n;i++)
		{
			table[i] += table[i-10];
		}
		
		for(i=0;i<n;i++)
		{
			System.out.println(table[i]);
		}



	}
}