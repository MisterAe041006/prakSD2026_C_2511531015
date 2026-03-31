package pekan1_2511531015;
import java.util.Scanner;

public class Jam_2511531015_Driver2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Driver Objek Jam_2511531015 ===");

        // 1. Input Jam Pertama
        System.out.println("\n--- Input Jam_2511531015 1 ---");
        Jam_2511531015 j1 = buatJam_2511531015DariInput(input);

        // 2. Input Jam Kedua
        System.out.println("\n--- Input Jam_2511531015 2 ---");
        Jam_2511531015 j2 = buatJam_2511531015DariInput(input);

        // 3. Menampilkan Data
        System.out.println("\n--- Hasil Operasi ---");
        System.out.println("Jam_2511531015 1 (String): " + j1.toString());
        System.out.println("Jam_2511531015 2 (String): " + j2.toString());
        System.out.println("Jam_2511531015 1 dalam detik: " + j1.toSeconds());
        System.out.println("Jam_2511531015 2 dalam detik: " + j2.toSeconds());

        // 4. Operasi Relasional (Perbandingan)
        int perbandingan = j1.compareTo(j2);
        if (perbandingan > 0) {
            System.out.println("Status: Jam_2511531015 1 lebih lambat (setelah) dari Jam_2511531015 2");
        } else if (perbandingan < 0) {
            System.out.println("Status: Jam_2511531015 1 lebih cepat (sebelum) dari Jam_2511531015 2");
        } else {
            System.out.println("Status: Jam_2511531015 1 dan Jam_2511531015 2 sama persis");
        }

        // 5. Operasi Aritmatika
        System.out.println("Durasi (J1 ke J2): " + Jam_2511531015.durasiDetik(j1, j2) + " detik");

        Jam_2511531015 jNext = j1.nextSecond();
        System.out.println("Jam_2511531015 1 detik berikutnya: " + jNext);

        Jam_2511531015 jPrev = j1.prevSecond();
        System.out.println("Jam_2511531015 1 detik sebelumnya: " + jPrev);

        // 6. Operasi Penjumlahan Jam
        Jam_2511531015 jHasilPlus = j1.plus(j2);
        System.out.println("Hasil J1 + J2: " + jHasilPlus);

        input.close();
        System.out.println("\nProgram selesai.");
    }

    /**
     * Method untuk melakukan input dan validasi secara berulang
     * sampai user memasukkan angka yang benar.
     */
    private static Jam_2511531015 buatJam_2511531015DariInput(Scanner sc) {
        int h, m, s;

        while (true) {
            System.out.print("Masukkan Jam (0-23)   : ");
            h = sc.nextInt();

            System.out.print("Masukkan Menit (0-59) : ");
            m = sc.nextInt();

            System.out.print("Masukkan Detik (0-59) : ");
            s = sc.nextInt();

            if (Jam_2511531015.isValid(h, m, s)) {
                return new Jam_2511531015(h, m, s);
            } else {
                System.out.println("[Error] Input tidak valid! Silakan ulangi.\n");
            }
        }
    }
}