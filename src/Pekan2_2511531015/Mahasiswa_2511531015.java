package Pekan2_2511531015;

public class Mahasiswa_2511531015 {
    String nim;
    private String nama;
    private String prodi;

    public Mahasiswa_2511531015(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    @Override
    public String toString() {
        return "NIM: " + nim + ", Nama: " + nama + ", Prodi: " + prodi;
    }
}