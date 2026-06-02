import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class InsertBeginning {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(72);
        head.next.next = new Node(82);

        Node newNode = new Node(55);

        newNode.next = head;
        head = newNode;

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

}