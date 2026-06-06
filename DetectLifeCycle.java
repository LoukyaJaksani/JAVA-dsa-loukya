public class DetectLifeCycle {
    public static void main(String[] args) {
        Node head = new Node(72);
        head.next = new Node(26);
        head.next.next = new Node(82);
        head.next.next.next = new Node(81);

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            if (slow == fast) {
                System.out.println("Cycle Found");
                return;
            }

        }

        System.out.println("Cycle Not Found");
    }
}
