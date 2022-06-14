import java.util.ArrayList;

class BigFactorials {
    public static void main(String[] args) {
        System.out.println(Fact(50));
    }
    static ArrayList<Integer> Fact(int n)
    {
        ArrayList<Integer> list = new ArrayList<>();
        java.math.BigInteger bg = new java.math.BigInteger("1");
        for(int i=2;i<=n;i++)
            bg = bg.multiply(java.math.BigInteger.valueOf(i));
        
        char ch[] = bg.toString().toCharArray();
        for(char c : ch)
        {
            int i = Integer.parseInt(String.valueOf(c));
            list.add(i);
        }
        return list;
    }
}