package list;

import java.util.Arrays;

import model.ListNode;
import util.ListNodeUtil;

/**
 * @author xinyue <a href="https://leetcode-cn.com/problems/merge-two-sorted-lists/">合并两个有序链表</a>
 */
public class Solution21 {
    public static void main(String[] args) {
        ListNode node1 = ListNodeUtil.buildListNode(Arrays.asList(1, 3, 5));
        ListNode node2 = ListNodeUtil.buildListNode(Arrays.asList(1, 3, 5));
        ListNodeUtil.printList(mergeTwoLists(node1, node2));
    }

    public static ListNode mergeTwoLists(ListNode node1, ListNode node2) {
        if (node1 == null) {
            return node2;
        }
        if (node2 == null) {
            return node1;
        }
        if (node1.val < node2.val) {
            node1.next = mergeTwoLists(node1.next, node2);
            return node1;
        }
        node2.next = mergeTwoLists(node1, node2.next);
        return node2;
    }
}
