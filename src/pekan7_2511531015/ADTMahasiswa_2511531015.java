package pekan7_2511531015;

public class ADTMahasiswa_2511531015 {
    // Atribut Mahasiswa
    private String namaMahasiswa;
    private String nimMahasiswa;
    private String programStudi;

    // Constructor
    public ADTMahasiswa_2511531015(String namaMahasiswa_1015, String nimMahasiswa_1015, String programStudi_1015) {
        this.namaMahasiswa = namaMahasiswa_1015;
        this.nimMahasiswa = nimMahasiswa_1015;
        this.programStudi = programStudi_1015;
    }

    // Getter
    public String getNamaMahasiswa_1015() {
        return namaMahasiswa;
    }

    public String getNimMahasiswa_1015() {
        return nimMahasiswa;
    }

    public String getProgramStudi_1015() {
        return programStudi;
    }

    // Setter
    public void setNamaMahasiswa_1015(String namaMahasiswa_1015) {
        this.namaMahasiswa = namaMahasiswa_1015;
    }

    public void setNimMahasiswa_1015(String nimMahasiswa_1015) {
        this.nimMahasiswa = nimMahasiswa_1015;
    }

    public void setProgramStudi_1015(String programStudi_1015) {
        this.programStudi = programStudi_1015;
    }

    // toString untuk menampilkan informasi mahasiswa
    public String toString_1015() {
        return "Nama: " + namaMahasiswa + " | NIM: " + nimMahasiswa + " | Prodi: " + programStudi;
    }
}
