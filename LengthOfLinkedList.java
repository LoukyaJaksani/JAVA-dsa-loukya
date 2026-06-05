public class LengthOfLinkedList {
    public static void main(String[] args) {
        Node head = new Node(27);
        head.next = new Node(20);
        head.next = new Node(93);

        int length = 1;

        Node temp = head;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        System.out.println(length);

    }

}
