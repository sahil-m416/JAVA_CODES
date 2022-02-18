package Arrays;

import java.util.HashMap;

public class MajorityElement {
    static int majority(int a[])
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : a)
        {
            if(map.containsKey(i))
                map.put(i, map.get(i)+1);
            else
                map.put(i, 1);
            if(map.containsKey(i) && map.get(i)>a.length/2)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = { 2,2,3,4,2};
        System.out.println(majority(a));
    }
}
