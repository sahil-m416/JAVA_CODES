import java.util.Scanner;
class PINBS
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0)
		{
			int n = scan.nextInt();
			scan.nextLine();
			String s = scan.nextLine();
			boolean ans = false;
			int stoint = Integer.parseInt(s);

			if(stoint == 0 || stoint == 1)
			{
				System.out.println(ans);
				break;
			}

			int a[] = new int[n];
			for(int i=0;i<n;i++)
			{
				a[i] = s.charAt(i);
			}
			
		}
	}
}