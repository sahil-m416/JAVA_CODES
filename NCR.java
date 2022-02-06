public class NCR {
    public static void main(String[] args) {
        int n = 3;
        int r = 2;
        System.out.println(fact(n)/(fact(n-r)*fact(r)));
    }
    static int fact(int n)
    {
        if(n==0) return 1;
        return n*fact(n-1);
    }
}