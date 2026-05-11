package pekan6_2511531015;

public class HapusDLL_2511531015 {
// fungsi menghapus node awal
	public static NodeDLL_2511531015 delHead(NodeDLL_2511531015 head) {
		if (head == null) {
			return null; }
			NodeDLL_2511531015 temp = head;
			head = head.next_1015 ;
			if(head != null) {
				head.prev_1015 = null; }
			return head;
			
				
			}
			//fungsi menghapus di akhir
	public static NodeDLL_2511531015 delLast(NodeDLL_2511531015 head) {
		if (head == null) {
			return null; }
			if (head.next_1015 == null) {
				return null; }
			NodeDLL_2511531015 curr = head;
			while (curr.next_1015 != null) {
				curr = curr.next_1015 ;
				
			}
			//update pointer previuos node
			if (curr.prev_1015 != null) {
				curr.prev_1015.next_1015 = null; }
			return head;
		}
	//fungsi menghapus node posisi tertentu
	public static NodeDLL_2511531015 delPos(NodeDLL_2511531015 head, int pos) {
		//jia dll kosong
		if (head == null) {
			return head; }
		NodeDLL_2511531015 curr = head;
		//telusuri sampai ke node yang akan dihapus
		for (int i = 1; curr != null && i < pos; i++) {
			curr = curr.next_1015 ; }
			//jika posisi tidak ditemukan
			if(curr == null) {
				return head; }
			//update pointer
			if (curr.prev_1015 != null) {
				curr.prev_1015.next_1015 = curr.next_1015 ;  }
			if (curr.next_1015 != null) {
				curr.next_1015.prev_1015 =curr.prev_1015; }
			//jika yang dihapus head
			if (head == curr) {
				head = curr.next_1015; }
			return head;
			}
		//fungsi mencetak DLL
		public static void printList(NodeDLL_2511531015 head) {
			NodeDLL_2511531015 curr = head;
			while (curr != null) {
				System.out.print(curr.data_1015 + " ");
				curr = curr.next_1015;
				
			}
			System.out.println(); 
			
		}
		public static void main(String[] args) {
			//buat sebuah DLL
			NodeDLL_2511531015 head = new NodeDLL_2511531015(1);
			head.next_1015 = new NodeDLL_2511531015(2);
			head.next_1015.prev_1015 = head; 
			head.next_1015.next_1015 = new NodeDLL_2511531015(3);
			head.next_1015.next_1015.prev_1015 = head.next_1015;
			head.next_1015.next_1015.next_1015 = new NodeDLL_2511531015(4);
			head.next_1015.next_1015.next_1015.prev_1015 = head.next_1015.next_1015;
			head.next_1015.next_1015.next_1015.next_1015 = new NodeDLL_2511531015(5);   
			head.next_1015.next_1015.next_1015.next_1015.prev_1015 =    head.next_1015.next_1015.next_1015;
			
			System.out.print("DLL awal: ");
			printList(head);
			
			System.out.print("Setelah head dihapus: ");
			head = delHead(head);
			printList(head);
			
			System.out.print("Setelah node terakhir dihapus: ");
			head = delLast(head);
			printList(head);
			
			System.out.print("Menghapus node ke 2: ");
			head = delPos(head, 2);
			
			printList(head);
		}
		}
	
	