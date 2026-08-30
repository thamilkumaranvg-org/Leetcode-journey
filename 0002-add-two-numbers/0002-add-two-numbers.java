/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode temp = result;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0){
            int value1 = (l1 != null)? l1.val : 0;
            int value2 = (l2 != null)? l2.val : 0;
            int sum = value1 + value2 + carry;
            int digit = sum % 10;
            carry = sum / 10;
            ListNode newNode = new ListNode(digit);
            temp.next = newNode;
            temp = temp.next;
            l1 = (l1 != null)? l1.next : null;
            l2 = (l2 != null)? l2.next : null;
        }
        result = result.next;
        return result;
    }
}