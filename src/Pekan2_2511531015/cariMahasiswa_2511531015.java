package Pekan2_2511531015;
import java.util.ArrayList;
import java.util.Scanner;
public class cariMahasiswa_2511531015 {

	public static void cariMahasiswa(ArrayList<Mahasiswa_2511531015> list, Scanner sc) {
		System.out.print("Masukkan NIM yang dicari: ");
		String nimCari = sc.nextLine();
		boolean ditemukan = false;
		
		for (Mahasiswa_2511531015 mhs : list) {
			if (mhs.nim.equals(nimCari)) {
				System.out.println("Hasil Pencrian: " + mhs);
				ditemukan = true;
				break;
			}
			
		}
		
		if (!ditemukan) {
			System.out.println("NIM tidak ada.");
		}

	}

}
