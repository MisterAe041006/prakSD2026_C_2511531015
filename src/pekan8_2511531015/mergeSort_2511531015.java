package pekan8_2511531015;

public class mergeSort_2511531015 {

    void merge_1015(int arr[], int l, int m, int r) {
        // Menentukan ukuran dua subarray yang akan digabungkan
        int n1 = m - l + 1;
        int n2 = r - m;

        // Membuat array sementara
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Menyalin data ke array sementara L[]
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }

        // Menyalin data ke array sementara R[]
        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }

        // Indeks awal untuk subarray kiri, kanan, dan array utama
        int i = 0;
        int j = 0;
        int k = l;

        // Menggabungkan kembali array sementara ke arr[]
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Menyalin sisa elemen L[] jika masih ada
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Menyalin sisa elemen R[] jika masih ada
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void sort_1015(int arr[], int l, int r) {
        if (l < r) {
            // Menentukan titik tengah
            int m = (l + r) / 2;

            // Mengurutkan bagian kiri
            sort_1015(arr, l, m);

            // Mengurutkan bagian kanan
            sort_1015(arr, m + 1, r);

            // Menggabungkan bagian kiri dan kanan
            merge_1015(arr, l, m, r);
        }
    }

    static void printArray_1015(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Sebelum terurut:");
        printArray_1015(arr);

        mergeSort_2511531015 ob = new mergeSort_2511531015();
        ob.sort_1015(arr, 0, arr.length - 1);

        System.out.println("\nSesudah terurut menggunakan Merge Sort:");
        printArray_1015(arr);
    }
}