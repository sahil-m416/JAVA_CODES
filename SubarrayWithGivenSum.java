import java.util.ArrayList;
import java.util.Scanner;

public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }
        int s = scan.nextInt();
        scan.close();
        System.out.println(sum(a, n, s));
    }

    static ArrayList<Integer> sum(int a[], int n, int s)
    {
        int sum = 0;
        int front = 1;
        int rear = 1;

        for(int i=1;i<=n;i++)
        {
            sum += a[i-1];
            if(sum == s)
            break;
            if(sum > s)
            {
                sum = 0;
                ++front;
                rear = front;
                i = front-1;

            }
            else 
            {
                rear++;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        if(rear>n)
        {
            list.add(-1);
        } else {
            list.add(front);
            list.add(rear);
        }
        return list;
    }
}
