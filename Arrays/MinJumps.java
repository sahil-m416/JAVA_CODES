package Arrays;

public class MinJumps {
    static int jumps(int a[])
    {
        int sc = 0;
        int e = 0;
        int max = 0;
        for(int i=0;i<a.length-1;i++)
        {
            max = Math.max(max, i+a[i]);
            if(i == e)
            {
                sc++;
                e = max;
            }
        }
        return sc;
    }
    public static void main(String[] args) {
        int a [] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(jumps(a));
    }
}
