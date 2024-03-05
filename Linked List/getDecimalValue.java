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
 
class Solution
{
    public int getDecimalValue(ListNode head)
    {
        int exp = 0;

        ListNode currNode = head;
        while(currNode.next != null)
        {
            exp++;
            currNode = currNode.next;
        }

        int decimal = 0;

        while(head != null)
        {
            decimal += Math.pow(2, exp) * head.val;
            exp--;
            head = head.next;
        }

        return decimal;
    }
}
