package pekan8_2511531015;

public class shellsort_2511531015 {
 public static void shellsort_2511531015(int[] A) {
	 int n_1015 = A.length;
	 int gap_1015 = n_1015/2;
	 while (gap_1015 > 0) {
		 for (int i = gap_1015; i < n_1015; i++) {
			 int temp = A[i];
			 int j = i;
			 while (j >= gap_1015 && A[j - gap_1015] > gap_1015) {
				 A[j] = A[j - gap_1015];
				 j = j - gap_1015;
			 }
			 A[j] = temp;
		 }
		 gap_1015 = gap_1015 / 2;
	 }
 }
	public static void main(String[] args) {
		int[] data = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5,};
		
		System.out.print("Sebelum:");
		printArray(data);
		
		shellsort_2511531015(data);

		System.out.print("sesudah (shellsort): ");
		printArray(data);
		
		
	}
	public static void printArray(int[] arr) {
		for (int i_1015 : arr) System.out.print(i_1015 + " ");
		System.out.println();
	}

}
