
public class SortedLinkedListRemoveDuplicates {
    public static void main(String[] args) {

        Node head= new Node(17);
        head.next= new Node(28);
        head.next.next = new Node(39);
        head.next.next.next = new Node(39);
        head.next.next.next.next = new Node(233);

        Node temp= head;
        while(temp!=null&& temp.next!=null){
            if(temp.data==temp.next.data){
                temp.next = temp.next.next;
            }
            else{
                temp= temp.next;
            }
     
        }
 print(head);    
    }

    static void print(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }

    }
}