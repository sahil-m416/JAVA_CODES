import java.util.HashSet;
public class LongestConsecuSubseq {
    static int longest(int a[])
    {
        HashSet<Integer> set = new HashSet<>();
        int ans = 1;
        for(int i : a)
        {
            set.add(i);
        }
        for(int i=0;i<a.length;i++)
        {
            int count = 1;
            if(!set.contains(a[i]-1))
            {
                int j = a[i]+1;
                while(set.contains(j))
                {
                    count++;
                    j++;
                }
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,5,4,8,7};
        System.out.println(longest(a));
    }
}
