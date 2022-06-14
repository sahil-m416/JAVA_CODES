import java.util.*;

public class CountingChars {
    public static String count(String s)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        String fin = "";
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            else
                map.put(s.charAt(i), 1);
        }
        // TreeMap<Character, Integer> tree = new TreeMap();
        // tree.putAll(map);
        // for(Map.Entry<Character, Integer> entry : tree.entrySet())
            // fin += Character.toString(c) + Integer.toString(map.get(c)) + " ";
        return fin;
    }
    public static void main(String[] args) {
        System.out.println(count("helloworld"));
    }
}
