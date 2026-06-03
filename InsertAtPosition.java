public class InsertAtPosition {
    public static void main(String[] args) {
        Node head = new Node(38);
        head.next = new Node(19);
        head.next.next = new Node(218);

        int position = 2;

        Node newNode = new Node(55);

        Node temp = head;

        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        print(head);

    }

    static void print(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
}