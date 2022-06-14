package Sorting;

public class QuickSort {
    static void sort(int a[], int l, int r)
    {
        if(l<r)
        {
            int pi = partition(a,l,r);
            sort(a, l, pi-1);
            sort(a, pi+1, r);
        }
    }
    static int partition(int a[], int l, int r)
    {
        int j = l;
        int p = a[r];
        for(int i=l;i<=r;i++)
        {
            if(a[i]<=p)
            {
                swap(a, i, j);
                j++;
            }
        }
        return j-1;
    }
    static void swap(int a[], int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    static void print(int a[])
    {
        for(int i : a)
            System.out.print(i + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int a[] = {1,5,66,2,4,5,6,11,0};
        print(a);
        sort(a, 0, a.length-1);
        print(a);
    }
}
