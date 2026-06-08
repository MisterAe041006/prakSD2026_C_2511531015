package pekan9_2511531015;

public class Node_2511531015 {
    int data_1015;
    Node_2511531015 left_1015;
    Node_2511531015 right_1015;

    public Node_2511531015(int data_1015) {
        this.data_1015 = data_1015;
        left_1015 = null;
        right_1015 = null;
    }

    public void setleft_1015(Node_2511531015 node) {
        if (left_1015 == null)
            left_1015 = node;
    }

    public void setright_1015(Node_2511531015 node) {
        if (right_1015 == null)
            right_1015 = node;
    }

    public Node_2511531015 getleft_1015() {
        return left_1015;
    }

    public Node_2511531015 getright_1015() {
        return right_1015;
    }

    public int getdata_1015() {
        return data_1015;
    }

    public void setdata_1015(int data_1015) {
        this.data_1015 = data_1015;
    }

    void printPreorder(Node_2511531015 node) {
        if (node == null)
            return;
        System.out.print(node.data_1015 + " ");
        printPreorder(node.left_1015);
        printPreorder(node.right_1015);
    }

    void printPostorder(Node_2511531015 node) {
        if (node == null)
            return;
        printPostorder(node.left_1015);
        printPostorder(node.right_1015);
        System.out.print(node.data_1015 + " ");
    }

    void printInorder(Node_2511531015 node) {
        if (node == null)
            return;
        printInorder(node.left_1015);
        System.out.print(node.data_1015 + " ");
        printInorder(node.right_1015);
    }

    public String print() {
        return this.print("", true, "");
    }

    public String print(String prefix, boolean isTail, String sb) {
        if (right_1015 != null) {
            right_1015.print(prefix + (isTail ? "|   " : "    "), false, sb);
        }
        System.out.println(prefix + (isTail ? "\\-- " : "/-- ") + data_1015);
        if (left_1015 != null) {
            left_1015.print(prefix + (isTail ? "    " : "|   "), true, sb);
        }
        return sb;
    }
}