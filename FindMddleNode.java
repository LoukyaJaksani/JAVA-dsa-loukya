public class FindMddleNode {
    public static void main(String[] args) {
        Node head = new Node(28);
        head.next = new Node(24);
        head.next.next = new Node(83);
        head.next.next.next = new Node(92);

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        System.out.println(slow.data);

    }
}