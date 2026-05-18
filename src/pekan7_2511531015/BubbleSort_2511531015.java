package pekan7_2511531015;

public class BubbleSort_2511531015 {
public static void BubbleSort_25111531015(int[] arr) {
	int n_1015 = arr.length;
	for (int i = 0; i < n_1015; i++) {
		for (int j = 0; j < n_1015 - 1; j++) {
			if (arr[j] > arr[j + 1]) {
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
				//system.out.println("datar"+arrr[j]+" "+arr[j+1]);
			}
		}
	}
}
	public static void main(String[] args) {
		int arr[] = {23, 78, 45, 8, 32, 56, 1};
		int n_1015 = arr.length;
		System.out.print("array yang belum terurut:");
		for (int i = 0; i < n_1015; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
		//minMaxSelectionSort(arr, n);
		 BubbleSort_25111531015(arr);
		System.out.print("array yang terurut menggunakan BubbleSort_2511531015:");
		for (int i = 0; i < n_1015; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");

	}

}
