package pekan8_2511531015;

public class quicksort_2511531015 {

    static void swap_1015(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Metode tambahan untuk mengatur pivot menggunakan median of three
    static void MedianOfThree_1015(int[] arr, int low, int high) {
        int mid = low + (high - low) / 2;

        // Urutkan elemen low, mid, high
        if (arr[low] > arr[mid]) {
            swap_1015(arr, low, mid);
        }

        if (arr[low] > arr[high]) {
            swap_1015(arr, low, high);
        }

        if (arr[mid] > arr[high]) {
            swap_1015(arr, mid, high);
        }

        swap_1015(arr, mid, high);
    }

    static int partition_1015(int[] arr, int low, int high) {
        // Panggil fungsi MedianOfThree sebelum menentukan pivot
        MedianOfThree_1015(arr, low, high);

        // Sekarang arr[high] sudah berisi nilai median
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            // Jika elemen saat ini lebih kecil dari pivot
            if (arr[j] < pivot) {
                i++;
                swap_1015(arr, i, j);
            }
        }

        swap_1015(arr, i + 1, high);
        return i + 1;
    }

    static void quickSort_1015(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition_1015(arr, low, high);

            quickSort_1015(arr, low, pi - 1);
            quickSort_1015(arr, pi + 1, high);
        }
    }

    public static void printArr_1015(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int N = arr.length;

        System.out.print("Data sebelum diurutkan: ");
        printArr_1015(arr);

        quickSort_1015(arr, 0, N - 1);

        System.out.print("Data terurut Quick Sort: ");
        printArr_1015(arr);
    }
}