package merge_two_sorted_list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution2 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode header = new ListNode(0,new ListNode());
        ListNode h = header;
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        while (l1!=null && l2!=null){
            if (l1.val<l2.val){
                header.next = l1;
                header = l1;
                l1 = l1.next;
            }else {
                header.next = l2;
                header = l2;
                l2 = l2.next;
            }
        }
        while (l1!=null){
            header.next = l1;
            header = l1;
            l1 = l1.next;
        }
        while (l2!=null){
            header.next = l2;
            header = l2;
            l2 = l2.next;
        }
        return h.next;
    }
}
