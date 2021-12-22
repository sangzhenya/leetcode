package util;

import model.ListNode;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xinyue
 */
public class ListNodeUtil {
    public static void printList(ListNode listNode) {
        List<Integer> values = new ArrayList<>();
        while (listNode != null) {
            values.add(listNode.getVal());
            listNode = listNode.getNext();
        }
        System.out.println(StringUtils.join(values, "->"));
    }

    public static ListNode buildListNode(List<Integer> nvs) {
        if (CollectionUtils.isEmpty(nvs)) {
            return new ListNode();
        }
        ListNode node = new ListNode();
        node.setVal(nvs.get(0));
        ListNode headerNode = node;
        for (int i = 1; i < nvs.size(); i++) {
            ListNode nextNode = new ListNode();
            nextNode.setVal(nvs.get(i));
            node.setNext(nextNode);
            node = nextNode;
        }
        return headerNode;
    }
}
