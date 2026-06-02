import java.util.*;

public class InsertAtEnd {
    public static void main(String[] args) {
        Node head = new Node(100);
        head.next = new Node(200);
        head.next.next = new Node(300);

        Node newnode = new Node(500);

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newnode;

        print(head);

    }

    static void print(Node head) {
        while (head != null) {
            System.out.println(head.data + " ");
            head = head.next;
        }
    }
}