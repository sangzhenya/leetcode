package list;

import java.util.List;

import model.ListNode;
import util.ListNodeUtil;

/**
 * @author xinyue <a href="https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/">删除链表的倒数第 N 个结点</a>
 */
public class Solution19 {
    public static void main(String[] args) {
        ListNode listNode = ListNodeUtil.buildListNode(List.of(1, 2));
        ListNodeUtil.printList(removeNthFromEnd(listNode, 2));
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode fast = dummy;
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        ListNode slow = dummy;
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
