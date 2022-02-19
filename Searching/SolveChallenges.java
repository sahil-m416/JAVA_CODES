package Searching;


class SolveChallenges
{
    static int firsOcc(int a[], int k)
    {
        int low = 0;
        int high = a.length-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(a[mid] == k)
            {
                if(mid-1>=low && a[mid-1] == k)
                    high = mid-1;
                else
                    return mid;
            }
            else
            if(a[mid]<k)
                low = mid+1;
            else
            high = mid-1;
        }
        return -1;
    }
    static int lastOcc(int a[], int k)
    {
        int low = 0;
        int high = a.length-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(a[mid] == k)
            {
                if(mid+1<=high && a[mid+1] == k)
                    low = mid+1;
                else 
                    return mid;
            }
            else
            if(a[mid]>k)
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }
    static int challenges(int a[], int q[])
    {
        int sum = 0;
        for(int i : q)
        {
            int l = firsOcc(a, i);
            int r = lastOcc(a, i);
            sum += (r-l) + 1;
        }
        return sum;
    }
    public static void main(String[] args) {
        int a[] = {-5,-4,-3 ,-2, -1, 0, 0, 0, 1};
        int q[] = {-5, 1, 0, 2, -6};
        System.out.println(challenges(a, q));
    }
}