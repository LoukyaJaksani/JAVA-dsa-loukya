public class DeleteLastNode {
    public static void main(String[] args) {
        Node head = new Node(28);
        head.next = new Node(38);
        head.next.next = new Node(23);

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;

        while (head != null) {
            System.out.println(head.data + " ");
            head = head.next;
        }

    }

}
