package pekan6_2511531015;

public class PenulusuranDLL_2511531015 {
//fungsi penelusuran maju
	static void forwardTraversal (NodeDLL_2511531015 head) {
		//memulai penelusuran dari head
		NodeDLL_2511531015 curr = head;
		//lanjutkan sampai akhir 
		while (curr != null) {
			//print data
			System.out.print(curr.data_1015 + " <-> ");
			//pindah ke mode berikutnya
			curr = curr.next_1015 ;
			
		}
		//print spasi
		System.out.println();
	}
	//fungsi penelusuran mundur
	static void backwardTraversal(NodeDLL_2511531015 tail) {
		//mulai dari akhir 
		NodeDLL_2511531015 curr = tail;
		//lanjut sampai head 
		while (curr != null) {
			//cetak data
			System.out.print(curr.data_1015 + " <-> ");
			//pindah ke node sebelumnya
			curr = curr.prev_1015;
			
		}
		//cetak spasi
		System.out.println();
	}
	public static void main(String[] args) {
		//cetak DLL
		NodeDLL_2511531015 head = new NodeDLL_2511531015(1);
		NodeDLL_2511531015 second = new NodeDLL_2511531015(2);
		NodeDLL_2511531015 third = new NodeDLL_2511531015(3);
		
		head.next_1015 = second;
		second.prev_1015 = head;
		second.next_1015 = third;
		third.prev_1015 = second;
		
		System.out.println("penelusuran maju:");
		forwardTraversal(head);
		
		System.out.println("penelusuran mundur:");
		backwardTraversal(third);
 	}
}
