import java.util.Scanner;
class nextPermutation
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = scan.nextInt();
		}
		int indexone = 0;
		int indextwo = 0;

		// Traversing from back to search `indexone`

		for(int i=n-1;i>0;i--)
		{
			if(a[i] >a[i-1])
			{
				indexone = i;
			}
		}

		// Traversing from back again to search indextwo
		for(int i=n-1;i>=0;i--)
		{
			if(a[i] > a[indexone])
			{
				indextwo = i;
				break;
			}
		}
		System.out.println(indexone+" "+indextwo);

		// Performing Swap Operation 

		int temp = a[indexone];
		a[indexone] = a[indextwo];
		a[indextwo] = temp;

		for(int i=0;i<n;i++)
		{
			System.out.print(a[i] +" ");
		}
		System.out.println();

		// Reversing the Elements LAST STEP

		for(int i=indexone+1, j=n-1; i<=j; i++,j--)
		{
			int tem = a[i];
			a[i] = a[j];
			a[j] = tem;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i] +" ");
		}
	}
}