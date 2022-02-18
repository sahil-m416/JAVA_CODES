package Arrays;

public class DuplicateOfN1 {
    static int duplicate(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(i!=j)
                {
                    if(a[i] == a[j])
                    {
                        return a[i];
                    }
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {3,1,3,4,2};
        System.out.println(duplicate(a));
    }
}
