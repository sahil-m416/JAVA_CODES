class DeleteAndEarn
{
    public static void main(String[] args) {
        
    }
    static int earn(int a[])
    {
        int v[] = new int[10001]
        for(int num : a)
        {
            v[i] += num;
        }
        int take=0;
        int skip = 0;
        for(int i=0;i<n;i++)
        {
            int takei = skip + v[i];
            int skipi = Math.max(take, skip);
            take = takei;
            skip = skipi;
        }
        return Math.max(take, skip);
    }
}