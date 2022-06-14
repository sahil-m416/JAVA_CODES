//  package Arrays;

public class TrapRainWater {
    static int trapper(int a[])
    {
        int result = 0, low = 0, rightMax = 0, leftMax = 0;
        int high = a.length-1;
        while(low <= high)
        {
            if(a[low] >= a[high])
            {
                if(a[low]>leftMax)
                    leftMax = a[low];
                else
                    result += leftMax - a[low];
                low++;
            } else {
                if(a[high] > rightMax)
                    rightMax = a[high];
                else
                    result += rightMax - a[high];
                high--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int a[] = {7,4,0,9};
        System.out.println(trapper(a));
    }
}