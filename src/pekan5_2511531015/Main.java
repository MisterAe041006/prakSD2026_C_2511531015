package pekan5_2511531015;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Menampilkan NIM pada header
        System.out.println("=== Antrian Rumah Sakit NIM: 2511531015 ===");

        // Membuat instance dari RumahSakit_2511531015
        Scanner scanner = new Scanner(System.in);
        RumahSakit_2511531015 rumahSakit = new RumahSakit_2511531015();

        while (true) {
            // Menampilkan menu pilihan
            System.out.println("\n=== Menu ===");
            System.out.println("1. Daftarkan Pasien (Insert)");
            System.out.println("2. Panggil Pasien (Delete Head)");
            System.out.println("3. Tampilkan Antrian (Display)");
            System.out.println("4. Cari Pasien (Search)");
            System.out.println("5. Cek Status Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Untuk menangkap karakter newline setelah pilihan

            switch (pilihan) {
                case 1:
                    // Menambahkan pasien baru
                    System.out.print("Masukkan Nama Pasien: ");
                    String namaPasien = scanner.nextLine();
                    System.out.print("Masukkan Keluhan: ");
                    String keluhan = scanner.nextLine();
                    rumahSakit.daftarkanPasien_1015(namaPasien, keluhan);
                    break;
                case 2:
                    // Memanggil pasien pertama (head)
                    rumahSakit.panggilPasien_1015();
                    break;
                case 3:
                    // Menampilkan seluruh antrian
                    rumahSakit.tampilkanAntrian_1015();
                    break;
                case 4:
                    // Mencari pasien berdasarkan nama
                    System.out.print("Masukkan Nama Pasien yang ingin dicari: ");
                    String namaCari = scanner.nextLine();
                    rumahSakit.cariPasien_1015(namaCari);
                    break;
                case 5:
                    // Menampilkan status antrian
                    rumahSakit.cekStatusAntrian_1015();
                    break;
                case 6:
                    // Keluar dari program
                    System.out.println("Keluar dari program.");
                    scanner.close();  // Tutup scanner setelah keluar dari program
                    System.exit(0);   // Menghentikan program
                    break;
                default:
                    // Jika pilihan tidak valid
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}