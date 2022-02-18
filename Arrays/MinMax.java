package Arrays;

public class MinMax {
    static class Pair {
 
        int min;
        int max;
    }
    static Pair getMinMax(int a[], int n)
    {
        Pair pair = new Pair();
        if(n==1)
        {
            pair.min = a[0];
            pair.max = a[0];
            return pair;
        }
        if(a[0] < a[1])
        {
            pair.min = a[0];
            pair.max = a[1];
        }
        else 
        {
            pair.min = a[1];
            pair.max = a[0];
        }
        for(int i=2;i<a.length;i++)
        {
            if(a[i] < pair.min)
            {
                pair.min = a[i];
            }
            if(a[i] > pair.max)
            {
                pair.max = a[i];
            }
        }
        return pair;
    }
    public static void main(String args[]) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int arr_size = 6;
        Pair minmax = getMinMax(arr, arr_size);
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);
 
    }
}
