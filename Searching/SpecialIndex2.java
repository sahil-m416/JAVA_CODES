public class SpecialIndex2 {
   static  long getOccurence(int arr[], int n, int k)
{
  	int i = 0;
  	int j = n-1;
  	int mid = 0;
  	while(i<=j)
    {
      	mid = (i+j)/2;
  		if(arr[mid] == k)
        {
          	if((mid-1 >= i) && (arr[mid-1] == k))
              			j = mid - 1; 
          	else
              			return mid;
        }
      	else if(k < arr[mid])
        {
          	  j = mid - 1;
        }
      	else
        {
          		i = mid + 1;
        }
    }
  
  				return -1;			
  
 }


static long solveChallenges(int n, int arr[], int K, int challenges[])
{
 	 int i;
  	long sum = 0;
  	for(i=0;i<K;i++)
      {
        sum = sum + getOccurence(arr, n,challenges[i]);
        System.out.println(sum);
      }
  	return sum;
}
public static void main(String[] args) {
    int a[] = {2,2,4,5,5,5,6};
    int q[] = {5,2,6};
    System.out.println(solveChallenges(7, a, 3, q));
}
}
