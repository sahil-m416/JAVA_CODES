class BinarySearch
{
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int f = 5;
        System.out.println(binS(a,f));
    }

    static int binS(int a[], int f)
    {
        int low = 0;
        int high = a.length-1;

        while(low<=high)
        {
            int mid = low + (high - low) /2;

            if(a[mid] == f)
            {
                return mid+1;
            }

            if(a[mid] < f) 
                low = mid+1;

            if(a[mid] > f)
                high = mid -1;
        }
        return -1;
    }
}