package Arrays;

import java.util.HashSet;

public class UnionArray {
    public static int union(int a[], int b[])
    {
        HashSet<Integer> set = new HashSet<>();
        for(int i : a)
        {
            set.add(i);
        }
        for(int i : b)
        {
            set.add(i);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[] = {1,2};
        System.out.println(union(a, b));
    }
}
