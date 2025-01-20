package MedProblem;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class DeleteWithoutHead {
    public static void main(String[] args) {
        Node head = new Node(1);
    }
    static void delete(Node node){
        // After thinking too much, we just can't access the previous Node, so we will try to copy data of nodes into prev nodes
        Node temp = node;
        while(temp != null){
            temp.data = temp.next.data;
            temp = temp.next;
        }
    }
}
