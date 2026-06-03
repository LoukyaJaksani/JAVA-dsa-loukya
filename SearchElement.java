public class SearchElement {
    public static void main(String[] args) {
        Node head = new Node(56);
        head.next = new Node(82);
        head.next.next = new Node(12);

        int search = 12;

        Node temp = head;

        while (temp != null) {
            if (temp.data == search) {
                System.out.println(temp.data);
                return;
            }

            temp = temp.next;

        }
        System.out.println("Element not found");
    }

}
