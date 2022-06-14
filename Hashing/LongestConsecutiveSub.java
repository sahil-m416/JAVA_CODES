import java.util.HashSet;

public class LongestConsecutiveSub {
    static int longest(int a[])
    {
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        for(int i : a)
            set.add(i);
        for(int i=0;i<a.length;i++)
        {
            if(!set.contains(a[i]-1))
            {
                int j = a[i];
                while(set.contains(j))
                    j++;

                ans = Math.max(ans, j-a[i]);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[] = {1, 9, 3, 10, 4, 20, 2};
        System.out.println(longest(a));
    }
}
