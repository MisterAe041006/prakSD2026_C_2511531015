package pekan5_2511531015;

public class TambahSLL_2511531015 {
public static NodeSLL_2511531015 insertAtFront(NodeSLL_2511531015 head, int value) {
	NodeSLL_2511531015 new_node = new NodeSLL_2511531015(value);
	new_node.next_1015 = head;
	return new_node;
}
//fungsi menambahkan node di akhir SLL
public static NodeSLL_2511531015 insertAtEnd(NodeSLL_2511531015 head, int value) {
	//buat sebuah node dengan sebuah nilai
	NodeSLL_2511531015 newNode = new NodeSLL_2511531015(value);
	//jika list kosong maka node jadi head
	if (head == null) {
		return newNode;
		
	}
	// simpan head ke variabel sementara
	NodeSLL_2511531015 last = head;
	//telusuri ke node akhir
	while (last.next_1015 != null) {
		last = last.next_1015;
		
	}
	//ubah pointer
	last.next_1015 = newNode;
	return head;
	
}
static NodeSLL_2511531015 GetNode(int data) {
	return new NodeSLL_2511531015(data);
	
}
static NodeSLL_2511531015 insertPos(NodeSLL_2511531015 headNode, int position, int value) {
	NodeSLL_2511531015 head = headNode;
	if(position < 1)
		System.out.print("invalid position");
	if(position == 1) {
		NodeSLL_2511531015 new_node = new NodeSLL_2511531015(value);
	new_node.next_1015 = head;
	return new_node;
} else {
	while (position-- != 0) {
		if(position == 1) {
			NodeSLL_2511531015 newNode = GetNode(value);
			newNode.next_1015 = headNode.next_1015;
			headNode.next_1015 = newNode;
			break;
		}
		headNode = headNode.next_1015;
	}
	if(position != 1)
		System.out.print("posisi di luar jangkauan");   }
	return head; }
	public static void printList(NodeSLL_2511531015 head) {
		NodeSLL_2511531015 curr = head;
		while (curr.next_1015 != null) {
			System.out.print(curr.data_1015+"-->");
			curr = curr.next_1015;
			
		}
		if(curr.next_1015==null) {
			System.out.print(curr.data_1015); }
		System.out.println();
		
		
	}
	public static void main(String[] args) {
		//buat linked List 2->3->5->6
		NodeSLL_2511531015 head =new NodeSLL_2511531015(2);
		head.next_1015 = new NodeSLL_2511531015(3);
		head.next_1015.next_1015 = new NodeSLL_2511531015(5);
		head.next_1015.next_1015.next_1015 = new NodeSLL_2511531015(6);
		//cetak List Asli
		System.out.print("Senarai berantai awal");
		printList(head);
		//tambahkan node baru di depan
		System.out.print("tambah 1 simpul di depan: ");
		int data_1015 = 1;
		head = insertAtFront(head, data_1015);
		// cetak update list
		printList(head);
		//tambahkan node baru di belakang
		System.out.print("tambah 1 simpul di belakang: ");
		int data2_1015 = 7;
		head = insertAtEnd(head, data2_1015);
		//cetak update list
		System.out.print("tambah 1 simpul ke data 4: ");
		int data3_1015 = 4;
		int pos=4;
		head = insertPos(head,pos,data3_1015);
		//cetak update list
		printList(head);
		
		
	}

}
