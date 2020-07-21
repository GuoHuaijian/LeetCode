package com.lucky.july;

/**
 * 两数相加
 *
 * @Author Guo Huaijian
 * @Date 2020/7/21 10:44
 */
public class AddTwoNumbers {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(2);
        ListNode node1 = new ListNode(4);
        node.next = node1;
        ListNode node2 = new ListNode(3);
        node1.next = node2;

        ListNode anode = new ListNode(5);
        ListNode anode1 = new ListNode(6);
        anode.next = anode1;
        ListNode anode2 = new ListNode(4);
        anode1.next = anode2;
        AddTwoNumbers twoNumbers = new AddTwoNumbers();
        ListNode listNode = twoNumbers.addTwoNumbers(node, anode);
        System.out.println(listNode.next.next.val);
    }
}
