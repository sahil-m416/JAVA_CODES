// package Arrays;

import java.util.HashSet;

public class SubArraySumZero {
    static boolean isZero(int a[])
    {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for(int i=0;i<a.length;i++)
        {
            set.add(sum);
            sum += a[i];
            if(set.contains(sum))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int a[] = {4,2,-3,1,6};
        System.out.println(isZero(a));
    }
}