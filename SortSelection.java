public class SortSelection {
    static void selection(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int min_index = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[min_index] > arr[j])
                {
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
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
        selection(a);
        System.out.println("Final Array : ");
        print(a);
    }
}
