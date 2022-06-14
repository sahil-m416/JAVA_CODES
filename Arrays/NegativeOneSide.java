// package Arrays;

public class NegativeOneSide {
    static void NegOneSide(int a[])
    {
        int low = 0;
        int high = a.length-1;
        while(low<=high)
        {
            if(a[low]<=0)
            {
                low++;
            }
            else{
                swap(a, low, high--);
            }
        }
    }
    public static void swap(int a[], int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a[] = {2,-1,2,3,5,-1,-2};
        System.out.println("Initial Array : ");
        print(a);
        NegOneSide(a);
        System.out.println("Final Array : ");
        print(a);
    }
}
