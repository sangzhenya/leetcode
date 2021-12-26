package list;

import java.util.List;

import model.ListNode;
import util.ListNodeUtil;

/**
 * @author xinyue <a href="https://leetcode-cn.com/problems/middle-of-the-linked-list/">链表的中间结点</a>
 */
public class Solution876 {
    public static void main(String[] args) {
        ListNode listNode = ListNodeUtil.buildListNode(List.of(1));
        ListNodeUtil.printList(middleNode(listNode));
    }

    public static ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
