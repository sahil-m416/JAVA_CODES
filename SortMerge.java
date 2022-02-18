public class SortMerge {
    static void merge(int a[], int l, int m, int r)
    {
        int i = l;
        int j = m+1;
        int k = r;
        int b[] = new int[a.length];
        while(i<=m && j<=r)
        {
            if(a[i] < a[j])
            {
                b[k] = a[i];
                i++;
            }
            else
            {
                b[k] = a[j];
                j++;
            }
            k++;
        }
        if(i>m)
        {
            while(j<=r)
            {
                b[k] = a[j];
                k++;
                j++;
            }
        }
        else 
        if(j>r)
        {
            while(i<=m)
            {
                b[k++] = a[i++];
            }
        }
        for(int z=l;z<=r;z++)
        {
            a[z] = b[z];
        }
    } 
    static void sort(int a[], int l, int r)
    {
        if(l<r)
        {
            int m = l+(r-l)/2;
            sort(a, l, m);
            sort(a, m+1, r);
            merge(a, l, m, r);
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
        int a[] = {2,1,5,7,2,1,6,8};
        System.out.println("Initial Array : ");
        print(a);
        
        System.out.println("Final Array : ");
        sort(a, 0, a.length-1);
        print(a);
    }
}
