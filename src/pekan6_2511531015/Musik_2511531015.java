package pekan6_2511531015;
import java.util.Scanner;

public class Musik_2511531015 {

	// Nama kelas mengikuti aturan: Musik_2511531015

	    private Lagu_2511531015 head_1015;

	    // Constructor
	    public Musik_2511531015() {
	        head_1015 = null;
	    }

	    // Menambah lagu di akhir playlist
	    public void tambahLagu_1015(String judul, String penyanyi) {
	        Lagu_2511531015 newLagu = new Lagu_2511531015(judul, penyanyi);
	        if (head_1015 == null) {
	            head_1015 = newLagu;
	        } else {
	            Lagu_2511531015 temp = head_1015;
	            while (temp.next_1015 != null) {
	                temp = temp.next_1015;
	            }
	            temp.next_1015 = newLagu;
	            newLagu.prev_1015 = temp;
	        }
	        System.out.println("Lagu berhasil ditambahkan!");
	    }

	    // Menghapus lagu pertama (head)
	    public void hapusLaguAwal_1015() {
	        if (head_1015 != null) {
	            head_1015 = head_1015.next_1015;
	            if (head_1015 != null) {
	                head_1015.prev_1015 = null;
	            }
	            System.out.println("Lagu pertama berhasil dihapus!");
	        } else {
	            System.out.println("Playlist kosong!");
	        }
	    }

	    // Menampilkan playlist dari awal ke akhir
	    public void tampilMaju_1015() {
	        if (head_1015 == null) {
	            System.out.println("Playlist kosong!");
	        } else {
	            Lagu_2511531015 temp = head_1015;
	            while (temp != null) {
	                System.out.print(temp.getJudul_1015() + " - " + temp.getPenyanyi_1015() + " <-> ");
	                temp = temp.next_1015;
	            }
	            System.out.println();
	        }
	    }

	    // Menampilkan playlist dari akhir ke awal
	    public void tampilMundur_1015() {
	        if (head_1015 == null) {
	            System.out.println("Playlist kosong!");
	        } else {
	            Lagu_2511531015 temp = head_1015;
	            while (temp.next_1015 != null) {
	                temp = temp.next_1015;
	            }
	            while (temp != null) {
	                System.out.print(temp.getJudul_1015() + " - " + temp.getPenyanyi_1015() + " <-> ");
	                temp = temp.prev_1015;
	            }
	            System.out.println();
	        }
	    }

	    // Mencari lagu berdasarkan judul (tidak case-sensitive)
	    public void cariLagu_1015(String judul) {
	        if (head_1015 == null) {
	            System.out.println("Playlist kosong!");
	            return;
	        }
	        Lagu_2511531015 temp = head_1015;
	        boolean found = false;
	        while (temp != null) {
	            if (temp.getJudul_1015().equalsIgnoreCase(judul)) {
	                System.out.println("Lagu ditemukan: " + temp.getJudul_1015() + " - " + temp.getPenyanyi_1015());
	                found = true;
	                break;
	            }
	            temp = temp.next_1015;
	        }
	        if (!found) {
	            System.out.println("Lagu tidak ditemukan!");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Musik_2511531015 playlist = new Musik_2511531015();

	        while (true) {
	            System.out.println("\n=== Playlist Musik NIM: 2511531015 ===");
	            System.out.println("1. Tambah Lagu");
	            System.out.println("2. Hapus Lagu Pertama");
	            System.out.println("3. Lihat Playlist (Maju)");
	            System.out.println("4. Lihat Playlist (Mundur)");
	            System.out.println("5. Cari Lagu");
	            System.out.println("6. Keluar");
	            System.out.print("Pilihan: ");
	            int pilihan = scanner.nextInt();
	            scanner.nextLine();  // Consume newline

	            if (pilihan == 1) {
	                System.out.print("Judul: ");
	                String judul = scanner.nextLine();
	                System.out.print("Penyanyi: ");
	                String penyanyi = scanner.nextLine();
	                playlist.tambahLagu_1015(judul, penyanyi);
	            } else if (pilihan == 2) {
	                playlist.hapusLaguAwal_1015();
	            } else if (pilihan == 3) {
	                playlist.tampilMaju_1015();
	            } else if (pilihan == 4) {
	                playlist.tampilMundur_1015();
	            } else if (pilihan == 5) {
	                System.out.print("Masukkan judul lagu yang dicari: ");
	                String judul = scanner.nextLine();
	                playlist.cariLagu_1015(judul);
	            } else if (pilihan == 6) {
	                break;
	            } else {
	                System.out.println("Pilihan tidak valid!");
	            }
	        }
	        scanner.close();
	    }
	}

