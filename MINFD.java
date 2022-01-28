import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;
class MINFD
{
	public static void main(String[] args)throws IOException {
		
		Scanner scan = new Scanner(System.in);
		int t= scan.nextInt();
		while(t-->0)
		{
			int n = scan.nextInt();
			int x = scan.nextInt();
			int total = 0;
			int a[] = new int[n];


			for (int i=0; i<n; i++) {
				a[i] = scan.nextInt();
				total =  total + a[i]; 
			}

			Arrays.sort(a);
			
			
				int sum = 0;
				
				int count = 0;
				if(x > total)
					{
						count = -1;
					}
					else {
							for(int i= a.length-1;i>=0;i--)
							{
								
								

									sum = sum + a[i];
									
									if(sum>=x)
									{
										count = Math.abs(a.length-i);
										break;
									}
								
							}
				}			
			System.out.println(count);

		}
	

	
	}

	
}