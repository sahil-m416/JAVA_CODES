import java.util.Scanner;

public class JumpGame2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }
        scan.close();
        System.out.println(jump(a));
    }

    static int jump(int nums[]){
        int len = nums.length-1;
        int current = -1;
        int next = 0;
        int fin = 0;
        for(int i=0;next<len;i++)
        {
            if(i> current)
            {
                fin++;
                current = next;
            };
            next = Math.max(next, nums[i] + i);
        };
        return fin;

    //     int sc = 0;
    //  int e = 0;
    //  int max = 0;
    //  for(int i=0; i<A.length-1; i++) {
    //         max = Math.max(max, i+A[i]);
    //     if( i == e ) {
    //             sc++;
    //           e = max;
    //     } 
    // }
    // return sc;

        
    }
}