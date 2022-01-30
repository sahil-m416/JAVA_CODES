import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class PlusOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0) 
        {
            int n = scan.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                list.add(scan.nextInt());
            }
            
            System.out.println(plusOne(list,n));
        }
        scan.close();
    }
    static ArrayList<Integer> plusOne(ArrayList<Integer> list, int n)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        int carry = 0;
        for(int i=n-1;i>=0;i--)
        {
            int d = list.get(i);
            if(i== n-1)
            {
                if(d==9)
                {
                    ans.add(0);
                    carry = 1;
                }
                else
                {
                    ans.add(d+1);
                }
            }
            else{
                d+=carry;
                carry = d/10;
                ans.add(d%10);
            }
        }

        if(carry !=0)
        {
            ans.add(carry);
        }
        Collections.reverse(ans);
        return ans;
    };
};