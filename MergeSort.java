public class MergeSort {
    static void sort(int a[], int l, int r)
    {
        if(l<r)
        {
        int mid = (l+r)/2;
        sort(a, l, mid);
        sort(a, mid+1, r);
        merge(a,l,mid,r);
        }
    }

    static void merge(int a[], int l, int mid, int r)
    {
        int i, j, k;
        int n1 = mid-l+1;
        int n2 = r-mid;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for(i=0;i<n1;i++)
            L[i] = a[l+i];
        for(j=0;j<n2;j++)
            R[j] = a[mid+1+j];
        i=0;
        j=0;
        k=l;
        while(i<n1 && j<n2)
        {
            if(L[i]<=R[j])
                a[k++] = L[i++];
            else
                a[k++] = R[j++];
        }
        while(i<n1)
            a[k++] = L[i++];
        while(j<n2)
            a[k++] = R[j++];
    }
    static void print(int a[])
    {
        for(int i : a)
            System.out.print(i+ " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int a[] = {2,4,67,8,3,2,1,0};
        print(a);
        sort(a, 0, a.length-1);
        print(a);
    }
}
