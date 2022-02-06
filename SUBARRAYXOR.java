import java.util.*;

class SUBARRAYXOR
{
    public static int fun(int prev,int ptr)
    {
        for(int i=1;i<20;++i)
        {
            if((ptr&(1<<i))!=0)
                prev^=(1<<i);
        }
        return prev;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    ArrayList<Integer> res=new ArrayList<>();
		    HashSet<Integer> s=new HashSet<>();
		    int prev=0;
		    int ptr=1;
		    for(int i=1;i<=n;++i)
		    {
		        while(s.contains(fun(prev,ptr)))
		            ptr+=1;
		        prev=fun(prev,ptr);
		        s.add(prev);
		        res.add(ptr);
		        ptr+=1;
		    }
		    for(int a:res)
		        System.out.print(a+" ");
		    System.out.println();
		}
	}
}