package Pekan3_2511531015;

public class Website_2511531015 {

	    // Atribut dengan akhiran 4 digit terakhir NIM: 1015
	    private String judul_1015;
	    private String url_1015;

	    // Constructor
	    public Website_2511531015(String judul_1015, String url_1015) {
	        this.judul_1015 = judul_1015;
	        this.url_1015 = url_1015;
	    }

	    // Getter
	    public String getJudul_1015() {
	        return judul_1015;
	    }

	    public String getUrl_1015() {
	        return url_1015;
	    }

	    // Setter
	    public void setJudul_1015(String judul_1015) {
	        this.judul_1015 = judul_1015;
	    }

	    public void setUrl_1015(String url_1015) {
	        this.url_1015 = url_1015;
	    }

	    // Menampilkan data website
	    @Override
	    public String toString() {
	        return "Judul Website: " + judul_1015 +
	               " | URL: " + url_1015;
	    }
	}

