package Searching;
public class RotationCount 
{
    static int count(int a[])
    {
        int low=0;
        int high=a.length-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            int next = (mid+1)%a.length;
            int prev = (mid-1+a.length)%a.length;
            if(a[mid]<a[prev] && a[mid]<a[next])
                return mid;
            else
            if(a[mid]>a[high])
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {5,1,2,3,4};
        System.out.println(count(a));
    }
}