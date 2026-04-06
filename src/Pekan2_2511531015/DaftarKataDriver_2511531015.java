package Pekan2_2511531015;

public class DaftarKataDriver_2511531015 {

	public static void main(String[] args) {
		DaftarKata_2511531015 al = new DaftarKata_2511531015();
		
		//menambah elemen (akhir)
		al.tambah("Kami");
		al.tambah("Informatika");
		
		//menyisipkan elemen pada indeks 1
		al.tambahPada(1, "Mahasiswa");
		
		//cetak isi awal
		System.out.println("Awal : " + al);
		
		//mengubah elemen (index 1)
		al.ubahElemen(1, "Departemen");
		System.out.println("Setealah Ubah: " + al);
		
		//menghapus elemen (hapus index 0)
		String terhapus = al.hapusElemen(0);
		System.out.println("Terhapus : " + terhapus);
		System.out.println("Setelah Hapus: " + al);
		
		//iterasi pada ArrayList (setak setiap elemen)
		System.out.print("Iterasi:");
		al.iterasiCetak();
		System.out.println();
		
		
		

	}

}
