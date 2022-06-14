package ByHeart;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthMin {
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i = 0;i<k;i++)
            q.add(arr[i]);
        
        for(int i=k;i<arr.length;i++)
        {
            if(arr[i]<q.peek())
            {
                q.remove();
                q.add(arr[i]);
            }
        }
        return q.peek();
    }
    public static void main(String[] args) {
        int a[] = {1,4,6,2,5};
        System.out.println(kthSmallest(a, 0, a.length, 2));
    }
}
