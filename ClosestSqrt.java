public class ClosestSqrt {
    static long sqrt(long n)
    {
        long mid, sqr, l=1, r=n-1, res=0;
        if(n==0 || n==1)
            return n;
        while(l<=r)
        {
            mid=(l+r)/2;
            sqr = mid*mid;
            if(sqr== n)
                return mid;
            else if(sqr<=n)
            {
                l=mid+1;
                res = mid;
            }
            else
                r = mid-1;
        }
        return r;
    }
    public static void main(String[] args) {
        System.out.println(sqrt(25));
    }
}
