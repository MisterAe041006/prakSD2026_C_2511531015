package pekan5_2511531015;

public class RumahSakit_2511531015 {
    // Pointer ke head (pasien pertama)
    private Pasien_2511531015 head_1015;
    private int nomorAntrianTerakhir_1015;

    // Konstruktor untuk inisialisasi linked list
    public RumahSakit_2511531015() {
        head_1015 = null;
        nomorAntrianTerakhir_1015 = 0;
    }

    // Daftarkan Pasien (Insert at Tail)
    public void daftarkanPasien_1015(String namaPasien_1015, String keluhan_1015) {
        nomorAntrianTerakhir_1015++;
        Pasien_2511531015 pasienBaru_1015 = new Pasien_2511531015(namaPasien_1015, keluhan_1015, nomorAntrianTerakhir_1015);

        if (head_1015 == null) {
            head_1015 = pasienBaru_1015;
        } else {
            Pasien_2511531015 temp_1015 = head_1015;
            while (temp_1015.getNext_1015() != null) {
                temp_1015 = temp_1015.getNext_1015();
            }
            temp_1015.setNext_1015(pasienBaru_1015);
        }
        System.out.println("Pasien berhasil didaftarkan! Nomor Antrian: " + pasienBaru_1015.getNomorAntrian_1015());
    }

    // Panggil Pasien (Delete Head)
    public void panggilPasien_1015() {
        if (head_1015 == null) {
            System.out.println("Antrian kosong.");
        } else {
            Pasien_2511531015 pasienDipanggil_1015 = head_1015;
            head_1015 = head_1015.getNext_1015();
            System.out.println("Pasien yang dipanggil: " + pasienDipanggil_1015.getNamaPasien_1015());
        }
    }

    // Tampilkan Antrian (Display)
    public void tampilkanAntrian_1015() {
        if (head_1015 == null) {
            System.out.println("Antrian kosong.");
        } else {
            Pasien_2511531015 temp_1015 = head_1015;
            int posisi = 1;
            while (temp_1015 != null) {
                System.out.println("Nomor Antrian: " + temp_1015.getNomorAntrian_1015() + " | Nama: " + temp_1015.getNamaPasien_1015() + " | Keluhan: " + temp_1015.getKeluhan_1015());
                temp_1015 = temp_1015.getNext_1015();
                posisi++;
            }
        }
    }

    // Cari Pasien (Search)
    public void cariPasien_1015(String namaPasien_1015) {
        Pasien_2511531015 temp_1015 = head_1015;
        while (temp_1015 != null) {
            if (temp_1015.getNamaPasien_1015().equalsIgnoreCase(namaPasien_1015)) {
                System.out.println("Pasien ditemukan: " + temp_1015.getNamaPasien_1015() + " | Nomor Antrian: " + temp_1015.getNomorAntrian_1015() + " | Keluhan: " + temp_1015.getKeluhan_1015());
                return;
            }
            temp_1015 = temp_1015.getNext_1015();
        }
        System.out.println("Pasien dengan nama " + namaPasien_1015 + " tidak ditemukan.");
    }

    // Cek Status Antrian
    public void cekStatusAntrian_1015() {
        if (head_1015 == null) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Jumlah total pasien: " + nomorAntrianTerakhir_1015);
            System.out.println("Pasien terdepan: " + head_1015.getNamaPasien_1015());
        }
    }
}