package pekan7_2511531015;

public class SelectionSort_2511531015 {
public static void SelectionSort_2511531015(int[] arr) {
	int n_1015 = arr.length;
	for (int i = 0; i < n_1015; i++) {
		int minIndex_1015 = i;
		for (int j = i + 1; j < n_1015; j++) {
			if (arr[j] < arr[minIndex_1015]) {
				minIndex_1015 = j;
			}
		}
		int temp_1015 = arr[i];
		arr[i] = arr[minIndex_1015];
		arr[minIndex_1015] = temp_1015;
	}
}
	public static void main(String[] args) {
		int arr[] = {23, 78, 45, 8, 32, 56, 1};
		int n_1015 = arr.length;
		System.out.printf("array yang belum terurut:\n");
		for (int i = 0; i < n_1015; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
		SelectionSort_2511531015(arr);
		System.out.printf("array yang terurut:\n");
		for (int i = 0; i < n_1015; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
		

	}

}
