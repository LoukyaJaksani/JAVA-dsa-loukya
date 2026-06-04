public class ReverseLinkedList {
    public static void main(String[] args) {

        Node head = new Node(28);
        head.next = new Node(83);
        head.next.next = new Node(48);

        Node current = head;
        Node prev = null;

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
            System.out.println(head.data + " ");
            head = head.next;
        }
    }
}
