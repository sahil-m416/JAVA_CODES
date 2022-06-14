import java.util.ArrayList;
import java.util.HashSet;
public class GenerateStrings {
    static ArrayList<String> givenFunction(int n, int k)
    {
        ArrayList<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        String res = "";
        helperFunction(n, k, 0, res, list, set);
        return list;
    }
    static void helperFunction(int n, int k, int index, String str, ArrayList<String> list, HashSet<String> set)
    {
        if(n== index)
        {
            if(set.contains(str))
            {
                list.add(str);
                set.add(str);
            }
            return;
        }
        helperFunction(n, k, index+1, (index==k) ? str+"y" : str+"x", list, set);
    }
    public static void main(String[] args) {
        ArrayList<String> ans = givenFunction(3, 1);
        System.out.println(ans);
    }
}
