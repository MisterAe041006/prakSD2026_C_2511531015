package pekan9_2511531015;
public class BtreeDriver_2511531015 {
	
    public static void main(String[] args) {
        //Membuat Pohon
        BTree_2511531015 tree_1015 = new BTree_2511531015();
        System.out.print("Jumlah Simpul awal pohon: ");
        System.out.println(tree_1015.countNodes());
        //menambahkan simpul data 1
        Node_2511531015 root_1015 = new Node_2511531015(1);
        //menjadikan simpul 1 sebagai root
        tree_1015.setRoot(root_1015);
        System.out.println("Jumlah simpul jika hanya ada root");
        System.out.println(tree_1015.countNodes());
        Node_2511531015 node2_1015 = new Node_2511531015(2);
        Node_2511531015 node3_1015 = new Node_2511531015(3);
        Node_2511531015 node4_1015 = new Node_2511531015(4);
        Node_2511531015 node5_1015 = new Node_2511531015(5);
        Node_2511531015 node6_1015 = new Node_2511531015(6);
        Node_2511531015 node7_1015 = new Node_2511531015(7);
        Node_2511531015 node8_1015 = new Node_2511531015(8);
        Node_2511531015 node9_1015 = new Node_2511531015(9);
        root_1015.setleft_1015(node2_1015);
        node2_1015.setleft_1015(node4_1015);
        node2_1015.setright_1015(node5_1015);
        node4_1015.setright_1015(node8_1015);
        root_1015.setright_1015(node3_1015);
        node3_1015.setleft_1015(node6_1015);
        node3_1015.setright_1015(node7_1015);
        node6_1015.setleft_1015(node9_1015);
        //Set root
        tree_1015.setCurrent(tree_1015.getRoot());
        System.out.println("menampilkan simpul terakhir: ");
        System.out.println(tree_1015.getCurrent().getdata_1015());
        System.out.println("Jumlah simpul; setelah simpul 7 ditambahkan");
        System.out.println(tree_1015.countNodes());
        System.out.println("InOrder: ");
        tree_1015.printInorder();
        System.out.println("\nPreorder: ");
        tree_1015.printPreOrder();
        System.out.println("\nPostorder : ");
        tree_1015.printPostOrder();
        System.out.println("\nDmenampilkan simpul dalam bentuk pohon");
        tree_1015.print();
    
   }

}