package Arrays;


import java.util.HashSet;

public class SubsetOrNot {
    static boolean subset(int a[], int b[])
    {
        HashSet<Integer> set = new HashSet<>();
        for(int i : a)
        {
            set.add(i);
        }
        for(int j : b)
        {
            if(!set.contains(j))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        int b[] = {12, 4};
        System.out.println(subset(a, b));
    }
}
