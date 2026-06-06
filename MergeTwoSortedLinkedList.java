public class MergeTwoSortedLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node merge(Node list1, Node list2) {
        Node dummy = new Node(-1);
        Node tail = dummy;

        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                tail.next = list1;
                list1 = list1.next;
            }

            else {
                tail.next = list2;
                list2 = list2.next;
            }

            tail = tail.next;

        }

        if (list1 != null) {
            tail.next = list1;
        }
        if (list2 != null) {
            tail.next = list2;
        }

        return dummy.next;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.println(head.data);

            if (head.next != null) {
                System.out.println("->");
            }

            head = head.next;

        }
        System.out.println();

    }

    public static void main(String[] args) {

        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(5);
        Node list2 = new Node(2);
        list2.next = new Node(29);
        list2.next.next = new Node(45);

        System.out.println("List1");
        printList(list1);

        System.out.println("List2");
        printList(list2);

        Node result = merge(list1, list2);
        printList(result);
    }

}