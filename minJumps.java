import java.util.Scanner;
public class minJumps 
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = scan.nextInt();
		}

		int jumps = 0;

		int temp = a[0];
		int i=0;
		while(i<n)
		{
			i=i+a[i];
			jumps++;
		}
		System.out.println(jumps);
		System.out.println(jumps);

	
	}
}