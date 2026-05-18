package pekan6_2511531015;

public class Lagu_2511531015 {
	// Nama kelas mengikuti aturan: Lagu_2511531015
	    private String judul_1015;
	    private String penyanyi_1015;
	    public Lagu_2511531015 next_1015;
	    public Lagu_2511531015 prev_1015;

	    // Constructor
	    public Lagu_2511531015(String judul, String penyanyi) {
	        this.judul_1015 = judul;
	        this.penyanyi_1015 = penyanyi;
	        this.next_1015 = null;
	        this.prev_1015 = null;
	    }

	    // Getter dan Setter
	    public String getJudul_1015() {
	        return judul_1015;
	    }

	    public void setJudul_1015(String judul) {
	        this.judul_1015 = judul;
	    }

	    public String getPenyanyi_1015() {
	        return penyanyi_1015;
	    }

	    public void setPenyanyi_1015(String penyanyi) {
	        this.penyanyi_1015 = penyanyi;
	    }
	}

