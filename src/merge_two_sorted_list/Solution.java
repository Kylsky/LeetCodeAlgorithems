package merge_two_sorted_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//Runtime: 3 ms, faster than 21.54% of Java online submissions for Merge Two Sorted Lists.
//Memory Usage: 38.9 MB, less than 83.13% of Java online submissions for Merge Two Sorted Lists.
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(1);

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        List<Integer> list = new LinkedList<>();
        list.add(l1.val);
        list.add(l2.val);
        ListNode next1 = l1.next;
        ListNode next2 = l2.next;
        while (next1!=null){
            list.add(next1.val);
            next1 = next1.next;
        }
        while (next2!=null){
            list.add(next2.val);
            next2 = next2.next;
        }
        Collections.sort(list);
        ListNode head = new ListNode(list.get(0),new ListNode());
        ListNode next = head;
        for (int i =1;i<list.size();i++){
            ListNode newNode = new ListNode(list.get(i));
            next.next = newNode;
            next = next.next;
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
