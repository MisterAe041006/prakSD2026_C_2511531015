package pekan6_2511531015;

public class InsertDLL_2511531015 {
	//menambahkan node di awal DLL
	static NodeDLL_2511531015 insertBegin(NodeDLL_2511531015 head, int data) {
		//buat node baru
		NodeDLL_2511531015 new_node = new NodeDLL_2511531015(data);
		//jadikan pointer nextnya head
		new_node.next_1015 = head;
		//jadikan pointer prev head ke new_node
		if (head != null) {
			head.prev_1015 = new_node;
		}
		return new_node;
				}
	//fungsi menambahkann node di akhir
	public static NodeDLL_2511531015 insertEnd(NodeDLL_2511531015 head, int newData) {
		//buat node baru 
		NodeDLL_2511531015 newNode =  new NodeDLL_2511531015(newData);
		//jika dll null jadikan head
		if (head == null) {
			head = newNode;
		}
		else {
			NodeDLL_2511531015 curr = head;
			while(curr.next_1015 != null) {
				curr = curr.next_1015;
				
			}
			curr.next_1015 =newNode;
			newNode.prev_1015 = curr;
			
		}
		return head; 
	}
	//fungsi menambabhkan node di posisi tertentu
	public static NodeDLL_2511531015 insertAtPosition(NodeDLL_2511531015 head, int pos, int new_data) {
		//buat node baru
		NodeDLL_2511531015 new_node = new NodeDLL_2511531015(new_data);
		if (pos == 1) {
			new_node.next_1015 = head;
			if (head != null) {
				head.prev_1015 = new_node; }
			head = new_node;
			return head; }
			NodeDLL_2511531015 curr = head;
			for (int i = 1; i < pos - 1 && curr != null; ++i) {
				curr = curr.next_1015; }
				if (curr == null) {
					System.out.println("posisi tidak ada");
					return head; }
					new_node.prev_1015 = curr;
					new_node.next_1015 = curr.next_1015;
					curr.next_1015 = new_node;
					if (new_node.next_1015 != null) {
						new_node.next_1015.prev_1015 = new_node; }
					return head; 
			}
		
			public static void printList(NodeDLL_2511531015 head) {
				NodeDLL_2511531015 curr = head;
				while (curr != null) {
					System.out.print(curr.data_1015 + " <-> ");
					curr = curr.next_1015;
				}
				System.out.println();
		
	}
			public static void main(String[] args) {
				//membuat dll 2 <-> 3 <-> 5
				NodeDLL_2511531015 head = new NodeDLL_2511531015(2);
				head.next_1015 = new NodeDLL_2511531015(3);
				head.next_1015.prev_1015 = head;
				head.next_1015.next_1015 = new NodeDLL_2511531015(5);
				head.next_1015.next_1015.prev_1015 = head.next_1015;
				//cetak DLL awal
				System.out.print("DLL awal: ");
				printList(head);
				//tambah 6 di akhir
				System.out.print("simpul 1 ditambah di awal: ");
				printList(head);
				int data = 6;
				head= insertEnd(head, data);
				printList(head);
				//menambah node 4 di posisi 4
				System.out.print("tambah node 4 di posisi 4: ");
				int data2 = 4;
				int pos = 4;
				head = insertAtPosition(head, pos, data2);
				printList(head);
			}
}
