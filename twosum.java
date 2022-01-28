import java.util.Scanner;
import java.util.HashMap;
public class twosum
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];

		for(int i=0;i<n;i++)
		{
			a[i] = scan.nextInt();
		}

		int target = scan.nextInt();

		HashMap<Integer, Integer> hashmap = new HashMap<>();

		for(int i=0;i<n;i++)
		{
			if(!hashmap.containsKey((target - a[i])))
			{
				hashmap.put(a[i], i);
			}
			else
			{
				int result[] = {i, hashmap.get(target - a[i])};
				for(int k=0;k<result.length;k++)
				{
					System.out.print(result[k] + " ");
				}
			}
		}
	
	}
}