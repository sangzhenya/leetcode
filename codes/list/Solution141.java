package list;

import java.util.Arrays;

import model.ListNode;
import util.ListNodeUtil;

/**
 * @author xinyue <a href="https://leetcode-cn.com/problems/linked-list-cycle/">环形链表</a>
 */
public class Solution141 {
    public static void main(String[] args) {
        ListNode node = ListNodeUtil.buildListNode(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(hasCycle(node));
    }

    public static boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
