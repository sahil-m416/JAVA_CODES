package Sorting;

public class sortingP {
    static void QuickS(int a[], int l, int r)
    {
        if(l<r)
        {
            int pi = part(a,l,r);
            QuickS(a, l, pi-1);
            QuickS(a, pi+1, r);
        }
    }

    static int part(int a[], int l, int r)
    {
        int j=l;
        int p = a[r];
        for(int i=l;i<=r;i++)
        {
            if(a[i]<=p)
            {
                swap(a,i,j);
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
            System.out.print(i+ " ");
        System.out.println();
    }




    // MERGE SORT CODE

    static void MSort(int a[], int l, int r)
    {
        if(l<r)
        {
            int mid = (l+r)/2;
            MSort(a,l,mid);
            MSort(a,mid+1,r);
            merge(a,l,mid,r);
        }
    }
    static void merge(int a[], int l, int mid, int r)
    {
        int i,j,k;
        int n1 = (mid-l+1);
        int n2 = r-mid;
        int L_Array[]  = new int[n1];
        int R_Array[]  = new int[n2];
        for(i=0;i<n1;i++)
            L_Array[i] = a[l+i];
        for(j=0;j<n2;j++)
            R_Array[j] = a[mid+1+j];
        i=0;j=0;k=l;
        while(i<n1 && j<n2)
        {
            if(L_Array[i] <= R_Array[j])
                a[k++] = L_Array[i++];
            else
                a[k++] = R_Array[j++];
        }
        while(i<n1)
            a[k++] = L_Array[i++];
        while(j<n2)
            a[k++] = R_Array[j++];
    }
    public static void main(String[] args) {
        int a[] = {1,3,5,9,2,14,5,6,10};
        int b [] = {1,3,5,9,2,14,5,6,10};
        System.out.println("Performing Quick sort on the array -----");
        print(a);
        QuickS(a, 0, a.length-1);
        print(a);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Performing merge sort on the array ----");
        print(b);
        MSort(b, 0, b.length-1);
        print(b);
    }
}
