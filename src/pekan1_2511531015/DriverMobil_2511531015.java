package pekan1_2511531015;
import java.util.Scanner;
public class DriverMobil_2511531015 {
	

	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        Mobil_2511531015 mobil = new Mobil_2511531015();

	        int pilihan;

	        do {
	            System.out.println("\n=== MENU ADT MOBIL ===");
	            System.out.println("1. Tambah Mobil");
	            System.out.println("2. Tampilkan Data Mobil");
	            System.out.println("3. Ubah Data Mobil (Mutator/Setter)");
	            System.out.println("4. Tampilkan Data dengan Selector/Getter");
	            System.out.println("5. Hapus Mobil");
	            System.out.println("0. Keluar");
	            System.out.print("Pilih menu: ");
	            pilihan = input.nextInt();
	            input.nextLine(); // membersihkan newline

	            switch (pilihan) {
	                case 1:
	                    System.out.print("Masukkan nama mobil  : ");
	                    String nama = input.nextLine();

	                    System.out.print("Masukkan tahun mobil : ");
	                    int tahun = input.nextInt();

	                    System.out.print("Masukkan cc mobil    : ");
	                    int cc = input.nextInt();

	                    System.out.print("Masukkan harga mobil : ");
	                    long harga = input.nextLong();
	                    input.nextLine();

	                    System.out.print("Masukkan merk mobil  : ");
	                    String merk = input.nextLine();

	                    mobil.tambahMobil(nama, tahun, cc, harga, merk);
	                    break;

	                case 2:
	                    mobil.tampilData();
	                    break;

	                case 3:
	                    System.out.println("=== Ubah Data Mobil ===");

	                    System.out.print("Masukkan nama baru   : ");
	                    mobil.setNama(input.nextLine());

	                    System.out.print("Masukkan tahun baru  : ");
	                    mobil.setTahun(input.nextInt());

	                    System.out.print("Masukkan cc baru     : ");
	                    mobil.setCc(input.nextInt());

	                    System.out.print("Masukkan harga baru  : ");
	                    mobil.setHarga(input.nextLong());
	                    input.nextLine();

	                    System.out.print("Masukkan merk baru   : ");
	                    mobil.setMerk(input.nextLine());

	                    System.out.println("Data mobil berhasil diubah.");
	                    break;

	                case 4:
	                    System.out.println("=== Data Mobil (Getter/Selector) ===");
	                    System.out.println("Nama  : " + mobil.getNama());
	                    System.out.println("Tahun : " + mobil.getTahun());
	                    System.out.println("CC    : " + mobil.getCc());
	                    System.out.println("Harga : " + mobil.getHarga());
	                    System.out.println("Merk  : " + mobil.getMerk());
	                    break;

	                case 5:
	                    mobil.hapusMobil();
	                    break;

	                case 0:
	                    System.out.println("Program selesai.");
	                    break;

	                default:
	                    System.out.println("Pilihan tidak valid.");
	            }

	        } while (pilihan != 0);

	        input.close();
	    }
	}

