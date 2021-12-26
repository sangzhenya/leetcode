package list;

import java.util.List;

import model.ListNode;
import util.ListNodeUtil;

/**
 * @author xinyue <a href="https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/">删除链表的倒数第 N 个结点</a>
 */
public class Solution19 {
    public static void main(String[] args) {
        ListNode listNode = ListNodeUtil.buildListNode(List.of(1, 2, 3));
        ListNodeUtil.printList(removeNthFromEnd(listNode, 3));
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        if (fast == null) {
            return slow.next;
        }
        if (slow != null && slow.next != null) {
            slow.next = slow.next.next;
        }
        return head;
    }
}
