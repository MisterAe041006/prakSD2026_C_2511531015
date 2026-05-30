package pekan8_2511531015;

import java.util.Scanner;

class Lagu_2511531015 {
    String judul_1015;
    String penyanyi_1015;
    int durasi_1015;

    void isiData_1015(String judul_1015, String penyanyi_1015, int durasi_1015) {
        this.judul_1015 = judul_1015;
        this.penyanyi_1015 = penyanyi_1015;
        this.durasi_1015 = durasi_1015;
    }

    String tampilLagu_1015() {
        return judul_1015 + " - " + durasi_1015 + " detik";
    }
}

public class Sorting_2511531015 {

    static Lagu_2511531015[] dataLagu_1015 = new Lagu_2511531015[20];
    static Lagu_2511531015[] dataAwal_1015 = new Lagu_2511531015[20];
    static int jumlahLagu_1015 = 0;

    public static void main(String[] args) {
        Scanner input_1015 = new Scanner(System.in);
        int pilihan_1015;

        inputDataAwal_1015();

        do {
            salinDataAwal_1015();

            System.out.println("==========================================");
            System.out.println("=== Sorting Playlist NIM: 2511531015 ===");
            System.out.println("==========================================");
            System.out.println("Pilih Algoritma Sorting:");
            System.out.println("1. Shell Sort  - Berdasarkan Judul A-Z");
            System.out.println("2. Quick Sort  - Berdasarkan Durasi Ascending");
            System.out.println("3. Merge Sort  - Berdasarkan Judul A-Z");
            System.out.println("4. Keluar");
            System.out.print("Pilih Algoritma (1=Shell, 2=Quick, 3=Merge, 4=Keluar): ");
            pilihan_1015 = input_1015.nextInt();

            if (pilihan_1015 == 1) {
                System.out.println();
                System.out.println("Data Sebelum Sorting:");
                tampilData_1015();

                shellSort_1015();

                System.out.println();
                System.out.println("Data Setelah Shell Sort (Judul A-Z):");
                tampilData_1015();

            } else if (pilihan_1015 == 2) {
                System.out.println();
                System.out.println("Data Sebelum Sorting:");
                tampilData_1015();

                quickSort_1015(0, jumlahLagu_1015 - 1);

                System.out.println();
                System.out.println("Data Setelah Quick Sort (Durasi Asc):");
                tampilData_1015();

            } else if (pilihan_1015 == 3) {
                System.out.println();
                System.out.println("Data Sebelum Sorting:");
                tampilData_1015();

                mergeSort_1015(0, jumlahLagu_1015 - 1);

                System.out.println();
                System.out.println("Data Setelah Merge Sort (Judul A-Z):");
                tampilData_1015();

            } else if (pilihan_1015 == 4) {
                System.out.println();
                System.out.println("Program selesai. Terima kasih.");

            } else {
                System.out.println();
                System.out.println("Pilihan tidak tersedia. Silakan pilih angka 1, 2, 3, atau 4.");
            }

            System.out.println();

        } while (pilihan_1015 != 4);

        input_1015.close();
    }

    static void inputDataAwal_1015() {
        tambahDataAwal_1015("Say No", "Penyanyi 1", 210);
        tambahDataAwal_1015("Lebih Indah", "Penyanyi 2", 240);
        tambahDataAwal_1015("Somebodys Pleasure", "Penyanyi 3", 230);
        tambahDataAwal_1015("Kacamata", "Penyanyi 4", 200);
        tambahDataAwal_1015("Evaluasi", "Hindia", 215);
        tambahDataAwal_1015("Laskar Pelangi", "Nidji", 250);
        tambahDataAwal_1015("Sempurna", "Andra and The Backbone", 260);
    }

    static void tambahDataAwal_1015(String judul_1015, String penyanyi_1015, int durasi_1015) {
        if (jumlahLagu_1015 < dataAwal_1015.length) {
            dataAwal_1015[jumlahLagu_1015] = new Lagu_2511531015();
            dataAwal_1015[jumlahLagu_1015].isiData_1015(judul_1015, penyanyi_1015, durasi_1015);
            jumlahLagu_1015++;
        } else {
            System.out.println("Data playlist sudah penuh!");
        }
    }

    static void salinDataAwal_1015() {
        for (int i_1015 = 0; i_1015 < jumlahLagu_1015; i_1015++) {
            dataLagu_1015[i_1015] = new Lagu_2511531015();
            dataLagu_1015[i_1015].isiData_1015(
                    dataAwal_1015[i_1015].judul_1015,
                    dataAwal_1015[i_1015].penyanyi_1015,
                    dataAwal_1015[i_1015].durasi_1015
            );
        }
    }

    static void tampilData_1015() {
        for (int i_1015 = 0; i_1015 < jumlahLagu_1015; i_1015++) {
            System.out.println((i_1015 + 1) + ". " + dataLagu_1015[i_1015].tampilLagu_1015());
        }
    }

    // =========================================================
    // 1. SHELL SORT BERDASARKAN JUDUL A-Z
    // =========================================================
    static void shellSort_1015() {
        for (int gap_1015 = jumlahLagu_1015 / 2; gap_1015 > 0; gap_1015 = gap_1015 / 2) {
            for (int i_1015 = gap_1015; i_1015 < jumlahLagu_1015; i_1015++) {
                Lagu_2511531015 temp_1015 = dataLagu_1015[i_1015];
                int j_1015 = i_1015;

                while (j_1015 >= gap_1015 &&
                        dataLagu_1015[j_1015 - gap_1015].judul_1015.compareToIgnoreCase(temp_1015.judul_1015) > 0) {

                    dataLagu_1015[j_1015] = dataLagu_1015[j_1015 - gap_1015];
                    j_1015 = j_1015 - gap_1015;
                }

                dataLagu_1015[j_1015] = temp_1015;
            }
        }
    }

    // =========================================================
    // 2. QUICK SORT BERDASARKAN DURASI ASCENDING
    // =========================================================
    static void quickSort_1015(int kiri_1015, int kanan_1015) {
        if (kiri_1015 < kanan_1015) {
            int posisiPivot_1015 = partition_1015(kiri_1015, kanan_1015);

            quickSort_1015(kiri_1015, posisiPivot_1015 - 1);
            quickSort_1015(posisiPivot_1015 + 1, kanan_1015);
        }
    }

    static int partition_1015(int kiri_1015, int kanan_1015) {
        int pivot_1015 = dataLagu_1015[kanan_1015].durasi_1015;
        int i_1015 = kiri_1015 - 1;

        for (int j_1015 = kiri_1015; j_1015 < kanan_1015; j_1015++) {
            if (dataLagu_1015[j_1015].durasi_1015 <= pivot_1015) {
                i_1015++;
                tukarData_1015(i_1015, j_1015);
            }
        }

        tukarData_1015(i_1015 + 1, kanan_1015);
        return i_1015 + 1;
    }

    static void tukarData_1015(int indeksPertama_1015, int indeksKedua_1015) {
        Lagu_2511531015 temp_1015 = dataLagu_1015[indeksPertama_1015];
        dataLagu_1015[indeksPertama_1015] = dataLagu_1015[indeksKedua_1015];
        dataLagu_1015[indeksKedua_1015] = temp_1015;
    }

    // =========================================================
    // 3. MERGE SORT BERDASARKAN JUDUL A-Z
    // =========================================================
    static void mergeSort_1015(int kiri_1015, int kanan_1015) {
        if (kiri_1015 < kanan_1015) {
            int tengah_1015 = (kiri_1015 + kanan_1015) / 2;

            mergeSort_1015(kiri_1015, tengah_1015);
            mergeSort_1015(tengah_1015 + 1, kanan_1015);

            merge_1015(kiri_1015, tengah_1015, kanan_1015);
        }
    }

    static void merge_1015(int kiri_1015, int tengah_1015, int kanan_1015) {
        int n1_1015 = tengah_1015 - kiri_1015 + 1;
        int n2_1015 = kanan_1015 - tengah_1015;

        Lagu_2511531015[] kiriArray_1015 = new Lagu_2511531015[n1_1015];
        Lagu_2511531015[] kananArray_1015 = new Lagu_2511531015[n2_1015];

        for (int i_1015 = 0; i_1015 < n1_1015; i_1015++) {
            kiriArray_1015[i_1015] = dataLagu_1015[kiri_1015 + i_1015];
        }

        for (int j_1015 = 0; j_1015 < n2_1015; j_1015++) {
            kananArray_1015[j_1015] = dataLagu_1015[tengah_1015 + 1 + j_1015];
        }

        int i_1015 = 0;
        int j_1015 = 0;
        int k_1015 = kiri_1015;

        while (i_1015 < n1_1015 && j_1015 < n2_1015) {
            if (kiriArray_1015[i_1015].judul_1015.compareToIgnoreCase(kananArray_1015[j_1015].judul_1015) <= 0) {
                dataLagu_1015[k_1015] = kiriArray_1015[i_1015];
                i_1015++;
            } else {
                dataLagu_1015[k_1015] = kananArray_1015[j_1015];
                j_1015++;
            }
            k_1015++;
        }

        while (i_1015 < n1_1015) {
            dataLagu_1015[k_1015] = kiriArray_1015[i_1015];
            i_1015++;
            k_1015++;
        }

        while (j_1015 < n2_1015) {
            dataLagu_1015[k_1015] = kananArray_1015[j_1015];
            j_1015++;
            k_1015++;
        }
    }
}