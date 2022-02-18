package Arrays;

import java.util.Arrays;

public class MinMaxDiffHeights {
    static int mini(int a[], int k)
    {
        Arrays.sort(a);
        int ans = a[a.length-1] - a[0];
        int smallest = a[0] + k;
        int largest = a[a.length-1] - k;
        int min = 0;
        int max = 0;
        for(int i=0;i<a.length-1;i++)
        {
            min = Math.min(smallest, a[i+1] - k);
            max = Math.max(largest, a[i] + k);
            if(min < 0) 
                continue;
            ans = Math.min(ans, max-min);
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[] = {1,5,8,10};
        int k = 2;
        System.out.println(mini(a, k));
    }
}
