public class RemoveDuplicates {
    public static void main(String[] args) {
        Node head = new Node(26);
        head.next = new Node(33);
        head.next.next = new Node(33);
        head.next.next.next = new Node(63);

        Node temp = head;

        while (temp != null && temp.next != null) {
            if (temp.next == temp.next.next) {
                temp.next = temp.next.next;

            }

            else {
                temp = temp.next;
                ;
            }

        }
        return;

    }

}
