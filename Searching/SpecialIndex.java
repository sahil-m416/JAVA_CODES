package Searching;

public class SpecialIndex {
    static int special(int a[])
    {
        int mid = a.length/2;
        int leftSum = 0;
        int rightSum = 0;
        for(int i=0;i<mid;i++)
            leftSum += a[i];
        for(int i=a.length-1;i>mid;i--)
            rightSum += a[i];
        
        if(rightSum > leftSum)
        {
            while(rightSum > leftSum && mid < a.length-1)
            {
                rightSum -= a[mid+1];
                leftSum += a[mid];
                mid++;
            }
        }
        else
        {
            while(leftSum > rightSum && mid > 0)
            {
                leftSum -= a[mid-1];
                rightSum += a[mid];
                mid--;
            }
        }
        if(rightSum == leftSum)
            return mid;
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {-5,3,7,4,-2,5,2};
        System.out.println(special(a));       
    }
}
