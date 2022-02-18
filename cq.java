public class cq
{
    public static void main(String args[])
    {
        int a[] = { 1,2,3,4,5,6,7};
        int r = 3;
        int q[] = {3,0,1,5};
        int fin[] = new int[a.length];
        int j=0;
        for(int i=r;i<a.length;i++)
        {
            fin[j++] = a[i];
        }
        for(int i=0;i<r;i++)
            fin[j++] = a[i];
        
        for(int i : fin)
            System.out.print(i+ " " );
        for(int i : q)
            System.out.print(fin[i] + " ");
        }
    }