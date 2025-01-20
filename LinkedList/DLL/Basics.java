package DLL;

public class Basics {
    static Node makeDll(int[] arr){
        Node prevNode = new Node(-1);
        Node temp = prevNode;
        for (int i = 0; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            newNode.prev = temp;
            temp = temp.next;
        }
        return prevNode.next;
    }
}

class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}