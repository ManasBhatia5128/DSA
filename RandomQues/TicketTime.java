package RandomQues;

class Node{
    int data;
    Node next;
    int index;
    Node(int data, int index){
        this.data = data;
        this.next = null;
        this.index = index;
    }
}
public class TicketTime {
    static int ticketTime(int[] arr, int k){
        Node head = new Node(arr[0], 0);
        Node temp = head;
        int timer = 0;
        for(int i = 1; i < arr.length; i++){
            Node newNode = new Node(arr[i], i);
            temp.next = newNode;
            temp = temp.next;
        }
        temp.next = head;
        Node prevTemp = temp;
        temp = temp.next;
        // Now the element holds at arr[0]
        while (true) {
            temp.data = temp.data-1;
            if(temp.data == 0 && temp.index == k){
                timer++;
                return timer;
            }
            else if(temp.data == 0 && temp.index != k){
                prevTemp.next = temp.next;
                temp.next = null;
                temp = prevTemp.next;
                timer++;
            }
            else{
                temp = temp.next;
                prevTemp = prevTemp.next;
                timer++;
            }
        }
        // return 0;
    }
}
