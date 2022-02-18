package Searching;
class SumOfOcc
{
    static int sum(int a[], int q[])
    {
        int sum = 0;
        for(int i=0;i<q.length;i++)
        {
            int k = q[i];
            int fo = firstOcc(a, k);
            sum += fo;
        }
        return sum;
    }
    static int firstOcc(int a[], int k)
    {
        int low = 0;
        int high = a.length-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(a[mid] == k)
            {
                if(mid == 0)
                    return mid;
                else
                {
                    while(a[mid] == k)
                        mid--;
                } 
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
    public static void main(String[] args) {
        int a[] = {2,2,4,5,5,5,6};
        int q[] = {5,2,6};
        System.out.println(sum(a, q));
    }
}