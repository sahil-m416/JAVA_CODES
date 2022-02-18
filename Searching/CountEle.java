package Searching;

public class CountEle {
    static int fo(int a[], int n)
    {
        int l;
        int r;
        int i=0;
        int count = 0;
        l = first(a,n);
        if(l==-1)
            return l;
        r = last(a,n);
        for(i=l;i<=r;i++)
            if(a[i] ==n)
                count++;
        return count;
    }
    static int first(int a[], int k)
    {
        int i=0;
        int j = a.length-1;
        while(i<=j)
        {
            int mid = (i+j)/2;
            if(a[mid] == k)
            {
                if(mid-1>= i && a[mid-1] == k)
                    j=mid-1;
                else
                    return mid;
            }
            else 
            {
                if(k<a[mid])
                    j = mid-1;
                else 
                    i=mid+1;
            }
        }
        return -1;
    }
    static int last(int arr[], int k)
    {
        int i=0;
  	int j = arr.length-1;
  	int mid = 0;
  	
  	while(i<=j)
    {
      	mid = (i+j)/2;
      	if(arr[mid] == k)
        {
          	if(mid+1 <= j && arr[mid+1] == k)
            {
				   i = mid+1;
            }
          	else
            {
              		return mid;
			}
        }
      		else 
        {
          if(k < arr[mid])
        {
          		j = mid-1;
        }
          else
          {
            	i = mid + 1;
          }
        }
    }
  					return -1;
    }
    static int count(int a[], int q[])
    {
        int sum = 0;
        for(int i : q)
            sum += fo(a, i);
        return sum;
    }
    public static void main(String[] args) {
        int a[] = {2,2,4,5,5,5,6};
        int q[] = {5,2,6};
        System.out.println(count(a, q));
    }
}
