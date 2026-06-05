// public class ReverseLinkedList {
//     public static void main(String[] args) {
//         Node head = new Node(28);
//         head.next = new Node(72);
//         head.next.next = new Node(2);

//         Node current = head;
//         Node prev = null;

//         while (current != null) {
//             Node next = current.next;
//             current.next = prev;
//             prev = current;
//             current = next;
//         }

//         head = prev;
//         print(head);
//     }

//     static void print(Node head) {
//         while (head != null) {
//             System.out.println(head.data + " ");
//             head = head.next;
//         }
//     }
// }

import java.util.logging.Handler;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node head = new Node(29);
        head.next = new Node(82);
        head.next.next = new Node(85);
        head.next.next.next = new Node(916);

        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
        print(head);
    }

    static void print(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;

        }
    }
}