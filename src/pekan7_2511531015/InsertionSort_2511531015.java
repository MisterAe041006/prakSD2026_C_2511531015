package pekan7_2511531015;

public class InsertionSort_2511531015 {
	public static void InsertionSort_2511531015(int[] arr) {
		int n_1015 = arr.length;
		for(int i = 1; i < n_1015; i++) {
			int key_1015 = arr[i];
			int j_1015 = i - 1;
			while (j_1015 >= 0 && arr[j_1015] > key_1015) {
				arr[j_1015 + 1] = arr[j_1015];
				j_1015--;
				
			}
			arr[j_1015 + 1] = key_1015;
			
		}
	}
	public static void main(String[] args) {
		int arr[] = {23, 78, 45, 8, 32, 56, 1};
		int n_1015 = arr.length;
		System.out.printf("array yang belum terurut:\n");
		for (int i = 0; i < n_1015; i++) 
		System.out.print(arr[i] + " ");
		System.out.println("");
		InsertionSort_2511531015(arr);
		System.out.printf("array yang terurut:\n"); 
		for (int i_1015 = 0; i_1015 < n_1015; i_1015++)
			System.out.print(arr[i_1015] + " ");
		System.out.println("");
			
		
	}
}
