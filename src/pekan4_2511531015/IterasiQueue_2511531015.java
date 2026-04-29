package pekan4_2511531015;
import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;
public abstract class IterasiQueue_2511531015 {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		
		q.add("Praktikum");
		q.add("Struktur");
		q.add("Data");
		q.add("Dan");
		q.add("Algoritma");
		Iterator<String> iterator = q.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next() + "");
		}
	}

}
