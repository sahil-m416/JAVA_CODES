public class SortInsertion {
    static void insertion(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            int key = a[i];
            int j = i-1;
            while(j>=0 && key<a[j])
            {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
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
        insertion(a);
        System.out.println("Final Array : ");
        print(a);
    }
}
