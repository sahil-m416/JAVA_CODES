package Arrays;

public class Leaders {
    static int[] leaders(int a[])
    {
        int lead = a[a.length-1];
        int fin[] = new int[a.length];
        fin[0] = lead;
        int j = 1;
        for(int i=a.length-1;i>=0;i--)
        {
            if(a[i] > lead)
            {
                lead = a[i];
                fin[j++] = lead;
            }
        }
        return fin;
    }
    public static void main(String[] args) {
        int a[] = {12, 27, 14, 11, 25, 6, 7};
        int fin[] = new int[a.length-1];
        fin = leaders(a);
        for(int i : fin)
        {
            System.out.print(i+ " ");
        }
    }
}
