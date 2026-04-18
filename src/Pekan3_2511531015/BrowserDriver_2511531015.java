package Pekan3_2511531015;
import java.util.Scanner;
import java.util.Stack;
public class BrowserDriver_2511531015 {
	static Scanner input_1015 = new Scanner(System.in);
    static Stack<Website_2511531015> history_1015 = new Stack<>();

    // Method untuk mengunjungi website baru
    public static void kunjungiWebsite_1015() {
        System.out.print("Masukkan Judul: ");
        String judul_1015 = input_1015.nextLine();

        System.out.print("Masukkan URL: ");
        String url_1015 = input_1015.nextLine();

        Website_2511531015 websiteBaru_1015 = new Website_2511531015(
                judul_1015,
                url_1015
        );

        // Push: menambahkan website ke bagian paling atas stack
        history_1015.push(websiteBaru_1015);

        System.out.println("Berhasil mengunjungi halaman!");
    }

    // Method untuk tombol back
    public static void tombolBack_1015() {
        if (history_1015.isEmpty()) {
            System.out.println("History kosong. Tidak ada halaman untuk kembali.");
        } else {
            // Pop: menghapus website paling atas dari stack
            Website_2511531015 websiteDihapus_1015 = history_1015.pop();

            System.out.println("Berhasil kembali dari halaman: "
                    + websiteDihapus_1015.getJudul_1015());
        }
    }

    // Method untuk melihat halaman yang sedang aktif
    public static void lihatHalamanAktif_1015() {
        if (history_1015.isEmpty()) {
            System.out.println("History kosong. Belum ada halaman yang dikunjungi.");
        } else {
            // Peek: melihat website paling atas tanpa menghapusnya
            Website_2511531015 halamanAktif_1015 = history_1015.peek();

            System.out.println("Halaman aktif saat ini:");
            System.out.println(halamanAktif_1015);
        }
    }

    // Method untuk mengecek status history
    public static void cekStatusHistory_1015() {
        if (history_1015.isEmpty()) {
            System.out.println("Status history: Kosong");
        } else {
            System.out.println("Jumlah total riwayat website: " + history_1015.size());
        }
    }

    // Method untuk menampilkan menu
    public static void tampilkanMenu_1015() {
        System.out.println("\n=== Browser History NIM: 2511531015 ===");
        System.out.println("1. Kunjungi Website (Push)");
        System.out.println("2. Tombol Back (Pop)");
        System.out.println("3. Lihat Halaman Aktif (Peek)");
        System.out.println("4. Cek Status History");
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
                    kunjungiWebsite_1015();
                    break;

                case 2:
                    tombolBack_1015();
                    break;

                case 3:
                    lihatHalamanAktif_1015();
                    break;

                case 4:
                    cekStatusHistory_1015();
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

