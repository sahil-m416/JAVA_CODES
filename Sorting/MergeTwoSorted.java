package Sorting;

class MergeTwoSorted {
    static int[] mergeNSort(int a[], int b[])
    {
        int c[]  = new int[a.length + b.length];
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length)
        {
            if(a[i] < b[j])
                c[k++] = a[i++];
            else
                c[k++] = b[j++];
        }
        while(i<a.length)
            c[k++] = a[i++];
        while(j<b.length)
            c[k++] = b[j++];
        return c;
    }
    public static void main(String[] args) {
        int a[] = {1,3,5,7,9};
        int b[] = {2,4,6,8,10};
        int c[] = mergeNSort(a, b);
        for(int i: c)
        System.out.print(i+ " ");
    }
}