package pekan5_2511531015;

public class Pasien_2511531015 {
	    // Atribut untuk menyimpan informasi pasien
	    private String namaPasien_1015;
	    private String keluhan_1015;
	    private int nomorAntrian_1015;
	    // Pointer ke node pasien berikutnya
	    Pasien_2511531015 next_1015;

	    // Konstruktor untuk menginisialisasi atribut
	    public Pasien_2511531015(String namaPasien_1015, String keluhan_1015, int nomorAntrian_1015) {
	        this.namaPasien_1015 = namaPasien_1015;
	        this.keluhan_1015 = keluhan_1015;
	        this.nomorAntrian_1015 = nomorAntrian_1015;
	        this.next_1015 = null;
	    }

	    // Getter dan Setter untuk setiap atribut
	    public String getNamaPasien_1015() {
	        return namaPasien_1015;
	    }

	    public void setNamaPasien_1015(String namaPasien_1015) {
	        this.namaPasien_1015 = namaPasien_1015;
	    }

	    public String getKeluhan_1015() {
	        return keluhan_1015;
	    }

	    public void setKeluhan_1015(String keluhan_1015) {
	        this.keluhan_1015 = keluhan_1015;
	    }

	    public int getNomorAntrian_1015() {
	        return nomorAntrian_1015;
	    }

	    public void setNomorAntrian_1015(int nomorAntrian_1015) {
	        this.nomorAntrian_1015 = nomorAntrian_1015;
	    }

	    public Pasien_2511531015 getNext_1015() {
	        return next_1015;
	    }

	    public void setNext_1015(Pasien_2511531015 next_1015) {
	        this.next_1015 = next_1015;
	    }
	}

