package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ReduceToZero {
    static ArrayList<Integer> reduce(ArrayList<Integer> list)
    {
        Collections.sort(list);
        ArrayList<Integer> ans = new ArrayList<>();
       list.removeIf(n->(n==0));
       while(list.size() != 0)
       {
           int element = list.get(0);
           ans.add(list.size());
           list.removeIf(n -> (n==element));
       }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(3);
        list.add(3);
        list.add(1);
        list.add(1);
        list.add(9);
        System.out.println(reduce(list));
    }
}
