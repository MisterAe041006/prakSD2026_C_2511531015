package pekan4_2511531015;
import java.util.Queue;
import java.util.LinkedList;
public class QueueLinkedList_2511531015 {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		// tambah elemn { 0,1,2,3,4,5}
		for (int i = 0; i < 6; i++)
			q.add(i);
		//menampilkan isi antrian
		System.out.println("elemen antrian " + q);
		//menghapus kepala antrian
		int hapus = q.remove();
		System.out.println(" hapus elemen = " + hapus);
		System.out.println(q);
		//untuk melihat antrian terdepan
		int depan = q.peek();
		System.out.println("kepala antrian = " + depan);
		
		int banyak = q.size();
		System.out.print("Size antrian = " + banyak);

	}

}
