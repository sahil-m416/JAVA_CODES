
public class BestTimeForStock2 {
    public static int stocks(int a[])
    {
        int low = a[0];
        int ans = 0;
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<low)
            {
                low = a[i];
            }
            else
            {
                ans = Math.max(ans, a[i] - low);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[] = {7,1,5,3,6,4};
        System.out.println(stocks(a));
    }
}
