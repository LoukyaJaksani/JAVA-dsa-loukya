class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class InsertBeginning {

    public static void main(String[] args) {
        Node head = new Node(38);
        head.next = new Node(10);
        head.next.next = new Node(326);

        Node newNode = new Node(2100);

        newNode.next = head;
        head = newNode;
        while (head != null) {
            System.out.println(head.data + " ");
            head = head.next;
        }

    }
}