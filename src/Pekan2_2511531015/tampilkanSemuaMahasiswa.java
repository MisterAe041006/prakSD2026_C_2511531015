package Pekan2_2511531015;

import java.util.ArrayList;
import java.util.Scanner;

public class tampilkanSemuaMahasiswa {

	public static void tampilkanSemuaMahasiswa(ArrayList<Mahasiswa_2511531015> list) {
		if (list.isEmpty()) {
			System.out.println("Daftar mahasiswa kosong.");
		}else {
			System.out.println("Data Mahasiswa:");
			for (Mahasiswa_2511531015 mhs : list) {
				System.out.println(mhs);
				
			}
		}

	}
//4. Method untuk hapus mahasiswa berdasarkan NIM
	public static void hapusMahasiswa(ArrayList<Mahasiswa_2511531015> list, Scanner sc) {
		System.out.print("Masukkan NIM yang akan dihapus");
		String nimHapus = sc.nextLine();
		boolean removed = list.removeIf(mhs -> mhs.nim.equals(nimHapus));
		
		if (removed) {
			System.out.println("Data dengan NIM " + nimHapus + " berhasil dihapus.");
			
		}else {
			System.out.println("NIM tidak ditemukan.");
		}
	}
}
