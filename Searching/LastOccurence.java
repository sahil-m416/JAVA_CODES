package Searching;


public class LastOccurence {
    static int lastOcc(int a[], int x)
    {
        int low = 0;
        int high = a.length-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(a[mid] == x)
            {
                if((mid+1<=high) && (a[mid+1] == x))
                    low = mid+1;
                else 
                    return mid;
            }
            else
            if(a[mid]>x)
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {1,1,1,2,3,4,4,4,5,6};
        System.out.println(lastOcc(a, 6));
    }
}
