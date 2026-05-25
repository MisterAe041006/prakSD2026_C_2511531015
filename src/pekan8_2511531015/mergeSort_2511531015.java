package pekan8_2511531015;

public class mergeSort_2511531015 {
void merge(int arr[], int l, int m, int r) {
	//find sizes of two subarrays to be merged
	int n1 = m - 1 + 1;
	int n2 = r - m;
	/* create temp arrays */
	int L[] = new int[n1];
	int R[] = new int[n2];
	/*copy data to temp arryas */
	for (int i = 0; i < n1; ++i)
	L[i] = arr[l + i];
	for (int j = 0; j < n2; ++j)
		R[j] = arr[m + 1 + j];
	int i = 0, j = 0;
	//initial indexof merged subarrays array
	int k = 1;
	while (i < n1 && j < n2) {
		if (L[i] <= R[j]) {
			arr[k] = L[i];
			i++;
			
 		}else {
 			arr[k] = R[j];
 			j++;
 		}
		k++;
		
	}
	/* copy remaining elements of L[] if any */
	while (i < n1) {
		arr[k] = L[i];
		i++;
		k++;
		
	}
	while (j < n2) {
		arr[k] = R[j];
		j++;
		k++;
	}
}
	void sort(int arr[], int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			sort(arr, l, m);
			sort(arr, m + 1, r);
			merge(arr, l, m, r);
		}
	}
	static void  printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i< n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();

	}
	public static void main(String args[]) {
		int arr[] = { 12, 11, 13, 5, 6, 7};
		System.out.println("sebelum terurut");
		printArray(arr);
		mergeSort_2511531015 ob = new mergeSort_2511531015();
		ob.sort(arr, 0, arr.length - 1);
		System.out.println("\nsesudah terurut menggunakan merge sort");
		printArray(arr);
 	}
	

}
 

