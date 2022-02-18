package Searching;

public class BinarySearch {
    static int searched(int a[], int x)
    {
        int low = 0;
        int high = a.length-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(a[mid] == x)
                return mid;
            else
            if(a[mid]>x)
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,4,5,6,7,8};
        System.out.println(searched(a, 3));
    }
}
