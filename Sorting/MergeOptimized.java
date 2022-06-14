package Sorting;

class MergeOptimized
{
    static void sort(int a[], int b[])
    {
        int i=0;
        int j=0;
        while(i<a.length && j<b.length)
        {
            if(a[i]>b[j])
            {
                int temp = a[i];
                a[i] = b[j];
                b[j] = temp;
            }
            else
            {
                i++;
            }
        }
    }
    static void print(int k[])
    {
        for(int i: k)
            System.out.print(i+ " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int a[] = {1,3,5,7,9};
        int b[] = {2,4,6};
        print(a);
        print(b);
        sort(a, b);
        print(a);
        print(b);
    }
}