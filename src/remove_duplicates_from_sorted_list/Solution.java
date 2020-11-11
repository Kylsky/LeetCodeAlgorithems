package remove_duplicates_from_sorted_list;

//执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
//内存消耗：38 MB, 在所有 Java 提交中击败了82.85%的用户
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode next;
        ListNode pre = null;
        ListNode res = head;
        while (head!=null){
            next = head.next;
            if (pre!=null && head.val==pre.val){
                pre.next = next;
            }else {
                pre = head;
            }
            head = next;
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(1);
        listNode.next = listNode2;
        listNode2.next = listNode3;
        Solution solution = new Solution();
        solution.deleteDuplicates(listNode  );
    }
}
