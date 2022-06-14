// package Arrays;

public class CycleRotate {
    static void rotate(int a[])
    {
        int temp = a[a.length-1];
        for(int i=a.length-2;i>=0;i--)
        {
            a[i+1] = a[i];
        }
        a[0] = temp;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        rotate(a);
        for(int i : a) {
            System.out.print(i+ " ");
        }
    }
}
