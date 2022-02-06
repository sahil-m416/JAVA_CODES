
public class PermutationString {
    public static void main(String[] args) {
        String s = "ABC";
        int n = fact(s.length());
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                
            }
        }
    }

    static int fact(int n)
    {
        if(n==0) return 1;
        return n * fact(n-1);
    }
}
