package Arrays;

public class Kadanes {
    static int maxArray(int a[])
    {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<a.length;i++)
        {
            sum = sum+a[i];
            max = Math.max(sum, max);
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}
