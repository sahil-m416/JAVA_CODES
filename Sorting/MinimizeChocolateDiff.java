package Sorting;

public class MinimizeChocolateDiff {
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
    static int solve(int a[], int i, int j)
    {   
        return a[j] - a[i];
    }
    public static void main(String[] args) {
        int a[] = {2,3,7,4,9,5};
        int b = 4;
        sort(a, 0, a.length-1);
        int i=0;
        int j=b-1;
        int ans = Integer.MAX_VALUE;
        while(j<a.length)
        {
            ans = Math.min(ans, solve(a, i, j));
            i++;
            j++;
        }
        System.out.println(ans);

    }
}
