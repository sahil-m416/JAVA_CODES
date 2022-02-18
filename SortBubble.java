class SortBubble
{
    public static void Bubble(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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
        Bubble(a);
        System.out.println("Final Array : ");
        print(a);
    }
}