package Pekan2_2511531015;

public class Musik_2511531015 {
	    // Atribut dengan akhiran 4 digit terakhir NIM: 1015
	    private String judul_1015;
	    private String penyanyi_1015;
	    private int durasi_1015;

	    // Constructor
	    public Musik_2511531015(String judul_1015, String penyanyi_1015, int durasi_1015) {
	        this.judul_1015 = judul_1015;
	        this.penyanyi_1015 = penyanyi_1015;
	        this.durasi_1015 = durasi_1015;
	    }

	    // Getter
	    public String getJudul_1015() {
	        return judul_1015;
	    }

	    public String getPenyanyi_1015() {
	        return penyanyi_1015;
	    }

	    public int getDurasi_1015() {
	        return durasi_1015;
	    }

	    // Setter
	    public void setJudul_1015(String judul_1015) {
	        this.judul_1015 = judul_1015;
	    }

	    public void setPenyanyi_1015(String penyanyi_1015) {
	        this.penyanyi_1015 = penyanyi_1015;
	    }

	    public void setDurasi_1015(int durasi_1015) {
	        this.durasi_1015 = durasi_1015;
	    }

	    // Method untuk menampilkan data lagu
	    @Override
	    public String toString() {
	        return "Judul: " + judul_1015 +
	               " | Penyanyi: " + penyanyi_1015 +
	               " | Durasi: " + durasi_1015 + " detik";
	    }
	}

