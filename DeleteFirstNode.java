public class DeleteFirstNode {
    public static void main(String[] args) {
        Node head = new Node(29);
        head.next = new Node(20);
        head.next.next = new Node(17);

        head = head.next;

        while (head != null) {
            System.out.println(head.data + " ");
            head = head.next;
        }
    }
}