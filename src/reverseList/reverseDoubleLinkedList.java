package reverseList;

public class reverseDoubleLinkedList {
    class Node{
        Node pre;
        Node next;
    }

    public Node reverse(Node head){
        Node pre = null;
        Node next;
        while (head!=null){
            next = head.next;
            head.next = pre;
            head.pre = next;
            pre = head;
            head = next;
        }
        //head最终指向的是null，所以返回的是pre
        return pre;
    }
}
