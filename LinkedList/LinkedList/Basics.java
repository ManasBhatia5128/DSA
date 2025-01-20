package LinkedList;

public class Basics {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        Node head = makeSLL(arr);
        System.out.println(head.next.data);
    }

    static Node makeSLL(int[] arr) {
        Node dummyHead = new Node(-1);
        Node temp = dummyHead;
        for (int i = 0; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return dummyHead.next;
    }

    static Node deleteNode(Node head, int val) {
        Node temp = head;
        Node prevNode = new Node(-1);
        Node slightAns = prevNode;
        prevNode.next = temp;
        while (temp != null) {
            if (temp.data == val) {
                prevNode.next = temp.next;
                temp.next = null;
            }
        }
        return head.next != null ? head : slightAns;
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}