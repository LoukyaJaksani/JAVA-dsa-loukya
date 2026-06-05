public class SearchElement {
    public static void main(String[] args) {
        Node head = new Node(29);
        head.next = new Node(38);
        head.next.next = new Node(30);

        int key = 38;

        Node temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.data == key) {
                found = true;
                break;
            }

            temp = temp.next;
        }
        if (found) {
            System.out.println("Element Found");
        }

        else {
            System.out.println("Element not found");
        }
    }
}