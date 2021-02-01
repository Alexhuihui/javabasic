package top.alexmmd.javabasic.thread;

import java.util.HashMap;

/**
 * @author 汪永晖
 * @Date 2020/11/18 13:55
 */
//双向链表
public class ListNode {
    String key;//这里存储key便于元素满时，删除尾节点时可以快速从HashMap删除键值对
    Integer value;
    ListNode pre = null;
    ListNode next = null;

    ListNode(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

}
