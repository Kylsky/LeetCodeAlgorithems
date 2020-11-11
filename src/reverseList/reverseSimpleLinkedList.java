package reverseList;

public class reverseSimpleLinkedList {
    public Node reverse(Node node){

        Node nd = node;
        Node pre = null;
        Node next;
        while (nd!=null){
            next = nd.next;
            nd.next = pre;
            pre = nd;
            nd = next;
        }
        //nd最终指向的是null，所以返回的是pre
        return pre;
    }

    class Node{
        public Node next;

    }
}