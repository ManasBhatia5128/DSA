package MedProblem;

import java.util.Arrays;
import java.util.List;

public class ReverseLL {
    // Brute method: make another linked list by storing elements in array and making new linked list from reverse of array or use an stack for better approach
    // Since this approach involeves extra space complexity, we must play around with the links
    static ListNode reverse(ListNode head){
       ListNode temp = head;
       ListNode prev = null;
       while (temp != null) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
       }
       return prev;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) { this.val = val; this.next = next; 
    }
}