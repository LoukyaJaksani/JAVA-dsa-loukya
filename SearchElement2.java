public class SearchElement2 {
    public static void main(String[] args) {
        Node head = new Node(29);
        head.next = new Node(92);
        head.next.next = new Node(100);

        int key = 100;
        int position = 1;

        Node temp = head;

        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Found at position: " + position);

                return;
            }
            position++;
            temp = temp.next;

        }
        System.out.println("Not Found");
    }

}
