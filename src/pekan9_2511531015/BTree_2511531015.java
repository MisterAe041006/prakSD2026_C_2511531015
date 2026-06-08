package pekan9_2511531015;
public class BTree_2511531015 {
    private Node_2511531015 root_1015;
    private Node_2511531015 currentNode;

    public BTree_2511531015() {
        root_1015 = null;
    }

    public boolean search(int data_1015) {
        return search(root_1015, data_1015);
    }

    private boolean search(Node_2511531015 node_1015, int data_1015) {
        if (node_1015.getdata_1015() == data_1015)
            return true;
        if (node_1015.getleft_1015() != null)
            if (search(node_1015.getleft_1015(), data_1015))
                return true;
        if (node_1015.getright_1015() != null)
            if (search(node_1015.getright_1015(), data_1015))
                return true;
        return false;
    }

    public void printInorder() {
        root_1015.printInorder(root_1015);
    }

    public void printPreOrder() {
        root_1015.printPreorder(root_1015);
    }

    public void printPostOrder() {
        root_1015.printPostorder(root_1015);
    }

    public Node_2511531015 getRoot() {
        return root_1015;
    }
    public boolean isEmpty() {
    	return root_1015 == null;
    }
    public int countNodes() {
    	return countNodes(root_1015);
    }
    private int countNodes(Node_2511531015 node_1015) {
    	int count_1015 = 1;
    	if (node_1015 == null) {
    		return 0;
    	} else {
    		count_1015 += countNodes(node_1015.getleft_1015());
    		count_1015 += countNodes(node_1015.getright_1015());
    		return count_1015;
    	}
    }
    public void print() {
    	root_1015.print();
    }
    public Node_2511531015 getCurrent() {
    	return currentNode;
    }
    public void setCurrent(Node_2511531015 node_1015) {
    	this.currentNode = node_1015;
    }
    public void setRoot(Node_2511531015 root_1015) {
    	this.root_1015 = root_1015;
    }
}