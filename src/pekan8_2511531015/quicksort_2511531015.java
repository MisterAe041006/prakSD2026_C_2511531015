package pekan8_2511531015;

public class quicksort_2511531015 {
	static void  swap (int[] arr, int i, int j) 
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	//metode tambahan untuk mengaturr pivot menggunakan median of three
	static void MedianOfThree_1015(int[] arr,int low, int high)
	{
		int mid = low + (high - low) / 2;
		//urutkan elemen low, mid, high
		if (arr[low] > arr[mid]) {
			swap(arr, low, mid);
		}
		if (arr[low] > arr[high]) {
			swap(arr, low, high);
		}
		if (arr[mid] > arr[high]) {
			swap(arr, mid, high);
		}
		swap(arr, mid, high);
	}
	static int partition(int[] arr, int low, int high)
	{
		//panggil fungsi medianOfThree sebelum menentukan pivot 
		MedianOfThree_1015(arr, low, high);
		int pivot = arr[high]; //sekarang arr[high] sudah berisi  nilai median
		int i = (low - 1);
		
		for (int j = low; j <= high - 1; j++) {
			//jika elemen saat ini lebh kecil dari atau sama dengan pivot
			if (arr[j] < pivot) {
				//Increment indeks elemen yang lebih kecil
				i++;
				swap(arr, i, j);
				
			}
		}
		swap(arr, i + 1, high);
		return (i + 1);
	}
	
		
	
static void quickSort(int[] arr, int low , int high)
{
	if (low < high) {
		int pi = partition(arr, low, high);
		quickSort(arr, low, pi - 1);
		quickSort(arr, pi + 1, high);
		
	}
}	
public static void printArr(int [] arr)
{
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
		
	}
	System.out.println();
	
}
public static void main(String[] args) 
{
	int[] arr = {10, 7, 8,  9, 1, 5,};
	int N = arr.length;
	System.out.print("data sebelum diurutkan: ");
	printArr(arr);
	quickSort(arr, 0, N - 1);
	
	System.out.print("data terurut quickSort: ");
	printArr(arr);
	}
}
