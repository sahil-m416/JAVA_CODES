import java.util.Scanner;
class UglyNumber
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println(getNthUglyNumber(a));
	}

	static int getNthUglyNumber(int n)
	{
		int ugly[] = new int[n];
		int i2=0, i3=0, i5=0;

		int mul2 = 2;
		int mul3 = 3;
		int mul5 = 5;
		int nextUgly = 1;
		ugly[0] = 1;

		

		for(int i=1;i<n;i++)
		{
			nextUgly = Math.min(mul2, Math.min(mul3, mul5));
			ugly[i] = nextUgly;

			if(nextUgly == mul2)
			{
				i2++;
				mul2 = ugly[i2] *2 ;
			}

			if(nextUgly == mul3)
			{
				i3++;
				mul3 = ugly[i3] * 3;
			}

			if(nextUgly == mul5)
			{
				i5++;
				mul5 = ugly[i5] * 5;
			}
		}
		return nextUgly;
	}
}