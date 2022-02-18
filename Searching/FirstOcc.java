package Searching;

public class FirstOcc {
    static long occ(int a[], int x)
    {
        long low = 0;
        long high = a.length-1;
        while(low<=high)
        {
            int mid = (int)(low+high)/2;
            if(a[mid] == x)
            {
                if(mid-1>=0 && a[mid-1] == x)
                {
                    high = mid-1;
                    continue;
                }
                return mid;
            }
            else if(a[mid]<x)
            {
                low = mid+1;
            }
            else
                high = mid-1;
            }
            return -1;
    }
    static int challenge( int a[], int n,int q[])
    {
        int sum = 0;
        for(int i : q)
        {
            sum += occ(a, i);
        }
        return sum;
    }
    public static void main(String[] args) {
        int a[] = {2,2,4,5,5,5,6};
        int q[] = {5,2,6};
        System.out.println(challenge(a, 4,q));
    }
}
