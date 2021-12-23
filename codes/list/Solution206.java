package list;

import model.ListNode;
import util.ListNodeUtil;

import java.util.Arrays;

/**
 * @author xinyue
 * <a href="https://leetcode-cn.com/problems/reverse-linked-list/">反转链表</a>
 */
public class Solution206 {
    public static void main(String[] args) {
        ListNode node = ListNodeUtil.buildListNode(Arrays.asList(1, 2, 3, 4, 5));
        ListNodeUtil.printList(reverseList(node));
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        ListNode newHeader = reverseList(next);
        next.next = head;
        head.next = null;
        return newHeader;
    }
}
