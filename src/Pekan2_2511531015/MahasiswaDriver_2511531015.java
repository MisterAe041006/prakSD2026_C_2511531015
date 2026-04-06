package Pekan2_2511531015;

import java.util.ArrayList;
import java.util.Scanner;

public class MahasiswaDriver_2511531015 {

    public static void tampilkanMenu() {
        System.out.println("\nMenu");
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Tampilkan Semua Mahasiswa");
        System.out.println("3. Hapus Mahasiswa Berdasarkan NIM");
        System.out.println("4. Cari Mahasiswa Berdasarkan NIM");
        System.out.println("5. Keluar");
    }

    public static void tambahMahasiswa(ArrayList<Mahasiswa_2511531015> list, Scanner sc) {
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Prodi: ");
        String prodi = sc.nextLine();

        list.add(new Mahasiswa_2511531015(nim, nama, prodi));
        System.out.println("Mahasiswa berhasil ditambahkan.");
    }

    public static void tampilkanSemuaMahasiswa(ArrayList<Mahasiswa_2511531015> list) {
        if (list.isEmpty()) {
            System.out.println("Data mahasiswa masih kosong.");
        } else {
            System.out.println("\nDaftar Mahasiswa:");
            for (Mahasiswa_2511531015 mhs : list) {
                System.out.println(mhs);
            }
        }
    }

    public static void hapusMahasiswa(ArrayList<Mahasiswa_2511531015> list, Scanner sc) {
        System.out.print("Masukkan NIM yang ingin dihapus: ");
        String nimHapus = sc.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNim().equals(nimHapus)) {
                list.remove(i);
                System.out.println("Mahasiswa berhasil dihapus.");
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("NIM tidak ditemukan.");
        }
    }

    public static void cariMahasiswa(ArrayList<Mahasiswa_2511531015> list, Scanner sc) {
        System.out.print("Masukkan NIM yang dicari: ");
        String nimCari = sc.nextLine();

        boolean ditemukan = false;
        for (Mahasiswa_2511531015 mhs : list) {
            if (mhs.getNim().equals(nimCari)) {
                System.out.println("Hasil Pencarian: " + mhs);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("NIM tidak ada.");
        }
    }

    public static void main(String[] args) {
        ArrayList<Mahasiswa_2511531015> mahasiswaList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            tampilkanMenu();
            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    tambahMahasiswa(mahasiswaList, scanner);
                    break;
                case 2:
                    tampilkanSemuaMahasiswa(mahasiswaList);
                    break;
                case 3:
                    hapusMahasiswa(mahasiswaList, scanner);
                    break;
                case 4:
                    cariMahasiswa(mahasiswaList, scanner);
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (choice != 5);

        scanner.close();
    }
}