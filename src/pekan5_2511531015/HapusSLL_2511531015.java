package pekan5_2511531015;

public class HapusSLL_2511531015 {
//fungsi untuk menghapus head
	public static NodeSLL_2511531015 deleteHead(NodeSLL_2511531015 head) {
		// jika SLL kosong
		if (head == null)
			return null;
	//pindahkan head ke mode berikutnya
		head = head.next_1015;
		//return head baru
		return head;	}
	//fungsi menghapus node terakhir SLL
	public static NodeSLL_2511531015 removeLastNode(NodeSLL_2511531015 head) {
		// jika list kosong, return null
		if (head == null) {
			return null;
			
		}
		//jika list satu node, hapus node dan return null 
		if (head.next_1015 == null) {
			return null;
			
		}
		//temukan node terakhir ke dua
		NodeSLL_2511531015 secondLast = head;
		while (secondLast.next_1015.next_1015 != null) {
			secondLast = secondLast.next_1015;
			
		}
		//hapus node terakhir
		secondLast.next_1015 = null;
		return head;
	}
	//fungsi menghapus node di posisi tertentu
	public static NodeSLL_2511531015 deleteNode(NodeSLL_2511531015 head, int position) {
		NodeSLL_2511531015 temp_1015 = head;
		NodeSLL_2511531015 prev_1015 = null;
		//jika linked list null
		if (temp_1015 == null)
			return head;
		//kasus 1: head dihapus
		if(position == 1) {
			head = temp_1015.next_1015;	
			return head;}
			//kasus 2: menghapus node di tengah
			//telusuri ke node yang dihapus
			for (int i = 1; temp_1015 != null && i <position; i++) {
				prev_1015 = temp_1015;
				temp_1015 = temp_1015.next_1015;	}
			//jika ditemukan, hapus node
			if (temp_1015 != null) {
				prev_1015.next_1015 = temp_1015.next_1015;
			} else {
				System.out.println("data tidak ada");	}
				return head;	}
		
				//fungsi mencetak SLL
			public static void printList(NodeSLL_2511531015 head) {
				NodeSLL_2511531015 curr = head;
				while(curr.next_1015 !=null) {
					System.out.print(curr.data_1015 + "-->");	
				curr = curr.next_1015;	}
				if(curr.next_1015==null) {
				System.out.print(curr.data_1015 ); }
				System.out.println(); }
				
			

//kelas main
public static void main (String[] args) {
	//buat SLL 1 -> 2-> 3-> 4-> 5 -> 6 -> null
	NodeSLL_2511531015 head = new NodeSLL_2511531015(1);
	head.next_1015 = new NodeSLL_2511531015(2);
	head.next_1015.next_1015 = new NodeSLL_2511531015(3);
	head.next_1015.next_1015.next_1015 = new NodeSLL_2511531015(4);
	head.next_1015.next_1015.next_1015.next_1015 = new NodeSLL_2511531015(5);
	head.next_1015.next_1015.next_1015.next_1015.next_1015 = new NodeSLL_2511531015(6);
	//cetak list awal
	System.out.println("list awal: ");
	printList(head);
	//hapus head
	head = deleteHead(head);
	System.out.println("list setelah head dihapus: ");
	printList(head);
	//hapus node terakhir
	head = removeLastNode(head);
	System.out.println("list setelah simpul terakhir di hapus: ");
	printList(head);
	//deleting node at pposition 2
	int position = 2;
	head = deleteNode(head, position);
	//print list after deletion
	System.out.println("List setelah posisi 2 dihapus; ");
	printList(head);
	
	
}
	
}


