package Arrays;

public class BestTimeForStocks {
    static int stocks(int a[])
    {
        int low_ind = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]< min)
            {
                min = a[i];
                low_ind = i;
            }
        }
        if(low_ind == a.length-1)
            return 0;
        for(int i=low_ind+1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max = a[i];
            }
        }
        return max - min;
    }
    public static void main(String[] args) {
        int a[] = {7,1,5,3,6,4};
        System.out.println(stocks(a));
    }
}
