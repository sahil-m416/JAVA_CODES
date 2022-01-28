import java.util.Scanner;
public class Keplerslaw
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0) 
		{
			int t1 = scan.nextInt();
			int t2 = scan.nextInt();
			int r1 = scan.nextInt();
			int r2 = scan.nextInt();
			String fin = "No";
			if((Math.pow(t1,2) / Math.pow(r1,3))  ==  (Math.pow(t2,2) / Math.pow(r2,3)))
			{
				fin = "Yes";
			}

			System.out.println(fin);
		}
	}
}