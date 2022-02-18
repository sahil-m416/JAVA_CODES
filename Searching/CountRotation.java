package Searching;
public class CountRotation {
    public static int count(int a[]) {
        int low = 0;
        int high = a.length-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(a[mid]< a[mid-1] && a[mid] < a[mid+1])
                return mid;
            else if(a[mid]>a[high])
                low = mid+1;
            else
                high = mid-1;
        }     
        return -1;   
    }
    public static void main(String[] args) {
        int a[] = {6,7,8,9,2,3,4,5};
        System.out.println(count(a));
    }
}
