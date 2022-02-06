class QuickSort {
	public static void main(String[] args) {
		int a[] = {10,7,8,9,1,5};
		int n = a.length;

		quicks(a, 0, n-1);
		System.out.print("\n Sorted array\n");
		print(a, n);
	}

	static void swap(int a[], int i, int j)
	{
		int temp = a[i];
		a[i]  = a[j];
		a[j] = a[i];
	}

	static int partition (int a[], int low, int high) {
		
		// PIVOT - THE LAST ELEMENT OF ARRAY

		int pivot = a[high];
		int i = low - 1;

		for (int j=low; j<=high-1; j++) {
			if(a[j] < pivot) {
				i++;
				swap(a, i, j);
			}
		}

		swap(a, i+1, high);
		return  i+1;

	}

	static void quicks(int a[], int low, int high) {
		if(low < high) {
			int pi = partition(a, low, high);
			quicks(a, low, pi-1);
			quicks(a, pi+1, high);
		}
	}

	static void print(int a[], int size) {
		for(int i=0;i<size;i++) {
			System.out.print(a[i] + " ");
		}
	}
	
}