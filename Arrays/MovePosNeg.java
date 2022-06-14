package Arrays;

public class MovePosNeg {
    static void move(int a[])
    {
        // int j=0, temp;
        // for(int i=0;i<a.length;i++)
        // {
        //     if(a[i]<0)
        //     {
        //         if(i != j)
        //         {
        //             temp = a[i];
        //             a[i] = a[j];
        //             a[j] = temp;
        //         }
        //          j++;
        //     }
        // }

        for(int i=0;i<a.length;i++)
        {
            if(a[i]>=0)
            {
                int j = i;
                while(j>0)
                {
                    if(a[j-1]<0)
                    {
                        int temp = a[j];
                        a[j] = a[j-1];
                        a[j-1] = temp;
                    }
                    else
                    {
                        break;
                    }
                    j--;
                }
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {-6, 7, 13, 10, -8, 15, 5, -9 ,2, -1};
        move(a);
        for(int i : a)
        {
            System.out.print(i+ " ");
        }
    }
}