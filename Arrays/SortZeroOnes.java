package Arrays;
public class SortZeroOnes {
   private static void sort(int a[])
    {
        int zero = 0;
        int one = 0;
        int two = 0;
        for(int i : a)
        {
            if(i == 1)
                one++;
            else
            if(i==2)
                two++;
            else
                zero++;
        }
        int i=0;
        while(zero-->0) 
        {
            a[i++] = 0;
        }
        while(one-->0)
        {
            a[i++] = 1;
        }
        while(two--> 0)
        {
            a[i++] = 2;
        }
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
        int a[] = {2,1,2,0,1,2};
        System.out.println("Initial Array : ");
        print(a);
        sort(a);
        System.out.println("Final Array : ");
        print(a);
    }
}
