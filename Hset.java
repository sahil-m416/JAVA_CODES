import java.util.Arrays;
import java.util.HashSet;

public class Hset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int a[] = {7, 10, 4, 3, 20, 15};
        Arrays.sort(a);
        int k = 4;
        for(int n: a)
        {
            set.add(n);
        }
        int arr[] = new int[set.size()];
        int i=0;
        for(int n : set)
        {
            arr[i++] = n;
        }
        System.out.println(arr[k]);
    }
}
