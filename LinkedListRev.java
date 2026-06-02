
class Node { // create node:
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class LinkedListRev {
    public static void main(String[] args) {

        // CREATE AND PRINT LINKEDLIST
        Node head = new Node(10); // decare head
        head.next = new Node(28);
        head.next.next = new Node(73);

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

}
