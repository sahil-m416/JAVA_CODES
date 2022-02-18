package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class KthMin {
    static int min(int a[], int k)
    {
        Arrays.sort(a);
        HashSet<Integer> set = new HashSet<>();
        for(int i : a)
        {
            set.add(i);
        }
        int j = 0;
        for(int i : set)
        {
            a[j++] = i;
        }
        return a[k];
    }
    public static void main(String[] args) {
        int a[] = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println(min(a, k));
    }
}
