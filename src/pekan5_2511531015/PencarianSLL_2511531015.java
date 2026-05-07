package pekan5_2511531015;

public class PencarianSLL_2511531015 {
	static boolean searchKey_1015(NodeSLL_2511531015 head, int key_1015) {
		NodeSLL_2511531015 curr = head;
		while (curr != null) {
			if(curr.data_1015 == key_1015)
				return true;
			curr = curr.next_1015; }
		return false; 	}
	public static void traversal(NodeSLL_2511531015 head) {
		//mulai dari head
		NodeSLL_2511531015 curr = head;
		//telusuri sampai pointer null
		while (curr != null) {
			System.out.print(" "+ curr.data_1015);
			curr = curr.next_1015;	}
		System.out.println();	}
		public static void main (String[] args) {
			NodeSLL_2511531015 head = new NodeSLL_2511531015(14);
			head.next_1015 = new NodeSLL_2511531015(21);
			head.next_1015.next_1015 = new NodeSLL_2511531015(13);
			head.next_1015.next_1015.next_1015 = new NodeSLL_2511531015(30);
			head.next_1015.next_1015.next_1015.next_1015 = new NodeSLL_2511531015(10);
			System.out.print("penulusuran SLL : ");
			traversal(head);
			//data yang akan dicari
			int key_1015 = 30;
			System.out.print("cari data "+key_1015+ " = ");
			if (searchKey_1015(head, key_1015))
				System.out.println("ketemu");
			else
				System.out.println("Tidak ada"); 
		}
	}

