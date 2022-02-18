package Arrays;
public class MaxDIfference {
    static int max(int a[])
    {
        int maxDiff = -1;
        int minEle = a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]-minEle > maxDiff)
            maxDiff=a[i]-minEle;
            if(minEle> a[i])
            minEle = a[i];
        }
        if(maxDiff == 0)
        return -1;
        return maxDiff;
    }
    public static void main(String[] args) {
        int a[] = {2,3,10,2,4,8,1};
        System.out.println(max(a));
    }
}
