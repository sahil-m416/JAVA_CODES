import java.util.Scanner;
public class PossiblePath
{
	public static void main(String[] args) {
		
	}

	static int NoOfPaths(int a, int b)
	{
		if(a==1 || b==1)
			return 1;

		int dp[a][b];

		for(int i=0;i<a-1;i++)
		{
			dp[i][b-1] = 1;
		}

		for(int i=0;i<b-1;i++)
		{
			dp[a-1][i] = 1;
		}

		for(int i=a-2;i>=0;i--)
		{
			for(int j=b-2;j>=0;j--)
			{
				dp[i][j] = d[i+1][j] + dp[i][j+1];
			}
		}
		return dp[0][0];	
	}
}