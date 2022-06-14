import java.util.HashMap;

public class LeastFav
{
    static int least(int favorites[])
    {
        HashMap<Integer, Integer> map = new HashMap<>();
    for(int i=0;i<favorites.length;i++)
    {
      if(map.containsKey(favorites[i]))
      	map.put(favorites[i], map.get(favorites[i])+1);
      else
        map.put(favorites[i],1);
    }
    int lowest = Integer.MAX_VALUE;
    int highestNo = favorites[0];
    for(int s : map.keySet())
    {
      if(map.get(s) <= lowest)
      {
        lowest = map.get(s);
        highestNo = s;
      }
    }
    return highestNo;
    }
    public static void main(String[] args) {
        int a[] = {1,3,2,2,4,3};
        System.out.println(least(a));
    }
}