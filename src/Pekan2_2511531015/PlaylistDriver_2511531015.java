package Pekan2_2511531015;
import java.util.ArrayList;
import java.util.Scanner;

public class PlaylistDriver_2511531015 {
	

	    static Scanner input_1015 = new Scanner(System.in);
	    static ArrayList<Musik_2511531015> playlist_1015 = new ArrayList<>();

	    public static void tambahLagu_1015() {
	        System.out.print("Masukkan Judul: ");
	        String judul_1015 = input_1015.nextLine();

	        System.out.print("Masukkan Penyanyi: ");
	        String penyanyi_1015 = input_1015.nextLine();

	        System.out.print("Masukkan Durasi (detik): ");
	        int durasi_1015 = input_1015.nextInt();
	        input_1015.nextLine();

	        Musik_2511531015 laguBaru_1015 = new Musik_2511531015(
	                judul_1015,
	                penyanyi_1015,
	                durasi_1015
	        );

	        playlist_1015.add(laguBaru_1015);
	        System.out.println("Data berhasil ditambahkan!");
	    }

	    public static void lihatPlaylist_1015() {
	        if (playlist_1015.isEmpty()) {
	            System.out.println("Playlist masih kosong.");
	        } else {
	            System.out.println("\n=== Daftar Playlist Musik ===");
	            for (int i = 0; i < playlist_1015.size(); i++) {
	                System.out.println((i + 1) + ". " + playlist_1015.get(i));
	            }
	        }
	    }

	    public static void hapusLagu_1015() {
	        if (playlist_1015.isEmpty()) {
	            System.out.println("Playlist masih kosong. Tidak ada lagu yang bisa dihapus.");
	            return;
	        }

	        lihatPlaylist_1015();

	        System.out.print("Masukkan nomor lagu yang ingin dihapus: ");
	        int nomor_1015 = input_1015.nextInt();
	        input_1015.nextLine();

	        int index_1015 = nomor_1015 - 1;

	        if (index_1015 >= 0 && index_1015 < playlist_1015.size()) {
	            Musik_2511531015 laguDihapus_1015 = playlist_1015.remove(index_1015);
	            System.out.println("Lagu \"" + laguDihapus_1015.getJudul_1015() + "\" berhasil dihapus.");
	        } else {
	            System.out.println("Nomor lagu tidak valid.");
	        }
	    }

	    public static void cekKapasitas_1015() {
	        System.out.println("Jumlah total lagu dalam playlist: " + playlist_1015.size());
	    }

	    public static void tampilkanMenu_1015() {
	        System.out.println("\n=== Playlist Musik NIM: 2511531015 ===");
	        System.out.println("1. Tambah Lagu");
	        System.out.println("2. Lihat Playlist");
	        System.out.println("3. Hapus Lagu");
	        System.out.println("4. Cek Kapasitas");
	        System.out.println("5. Keluar");
	        System.out.print("Pilihan: ");
	    }

	    public static void main(String[] args) {
	        int pilihan_1015;

	        do {
	            tampilkanMenu_1015();
	            pilihan_1015 = input_1015.nextInt();
	            input_1015.nextLine();

	            switch (pilihan_1015) {
	                case 1:
	                    tambahLagu_1015();
	                    break;

	                case 2:
	                    lihatPlaylist_1015();
	                    break;

	                case 3:
	                    hapusLagu_1015();
	                    break;

	                case 4:
	                    cekKapasitas_1015();
	                    break;

	                case 5:
	                    System.out.println("Program selesai. Terima kasih!");
	                    break;

	                default:
	                    System.out.println("Pilihan tidak valid. Silakan pilih 1-5.");
	            }

	        } while (pilihan_1015 != 5);

	        input_1015.close();
	    
	    }
}

