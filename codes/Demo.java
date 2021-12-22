import model.ListNode;
import util.ListNodeUtil;

import java.util.Arrays;

/**
 * @author xinyue
 */
public class Demo {
    public static void main(String[] args) {
        ListNode node = ListNodeUtil.buildListNode(Arrays.asList(1, 2, 3, 4, 5));
        ListNodeUtil.printList(node);
    }
}
