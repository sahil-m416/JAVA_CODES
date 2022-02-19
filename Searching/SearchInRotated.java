package Searching;
public class SearchInRotated {
    static int location(int a[], int k)
    {
        int low = 0;
        int high = a.length-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(a[mid] == k)
                return mid;
            else if(a[mid] <=a[high])
            {
                if(k>a[mid] && k<=a[high])
                    low = mid+1;
                else
                    high = mid-1;
            }
            else if(a[mid] > a[low])
            {
                if(k>=a[low] && k<a[mid])
                    high = mid-1;
                else 
                    low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {15,18,2,3,6,12};
        System.out.println(location(a, 6));
    }
}
