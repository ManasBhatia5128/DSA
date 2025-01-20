package MedProblem;

public class TortoiseHare {
    // In brute: simply find length and go to (n/2)th length
    // The best tortoisehare approach
    // The intution is when the fast pointer reaches the end, the slow pointer will
    // reach the middle nod;
    static ListNode middleNode(ListNode head) {
        ListNode temp1 = head;
        ListNode temp2 = head;
        while (temp2 != null && temp2.next != null) {
            temp1 = temp1.next;
            temp2 = temp2.next.next;
        }
        return temp1;
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