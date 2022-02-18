package Arrays;

public class InversionCount {
   static int count = 0;
    
    static void quicksort(int a[], int low, int high)
    {
        if(low<high)
        {
            int pi = partition(a, low, high);
            count++;
            quicksort(a, low, pi-1);
            quicksort(a, pi+1, high);
        }
    }
    static int partition(int a[], int low, int high)
    {
        int pivot = a[high];
        int i = low -1;
        for(int j = low;j<=high-1;j++)
        {
            if(a[j] < pivot)
            {
                i++;
                swap(a, i, j);
                
            }
        }
        swap(a, i+1, high);
        
        return(i+1);
    }
    static void swap(int a[], int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void main(String[] args) {
        int a [] = {2, 3, 4, 5, 6};
        int low = 0;
        int high = a.length-1;
        quicksort(a, low, high);
        for(int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(count);
        
    }
}
