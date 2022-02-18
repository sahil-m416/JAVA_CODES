
class SpecialIndex {
    static int index(int a[])
    {
        int low = 0;
        int fin = -1;
        int high = a.length-1;
        int lowSum=0, highSum = 0;
        while(low<=high)
        {
            if(low == 0 && high == a.length-1)
            {
                lowSum += a[low];
                highSum += a[high];
                low++;
                high--;
            }
            if(highSum < lowSum)
            {
                highSum += a[high];
                high--;
            }
            if(lowSum<highSum)
            {
                lowSum += a[low];
                low++;
            } 
            // if(lowSum == highSum)
            else
            {
                fin = low+1;
                break;
            }
        }
        return fin;
    }
    public static void main(String[] args) {
        int a[] = {1,4,6,-3,2,4,5,4,10,5,-5};
        // int a[] = {-5,3,7,4,-2,5,2};
        System.out.println(index(a));
    }
}