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
    public ListNode removeElements(ListNode head, int val)
    {                
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevNode = dummy, currNode = head;

        while(currNode != null)
        {
            if(currNode.val == val)
            {
                prevNode.next = currNode.next;
                currNode = prevNode.next;
                continue;
            }
                        
            currNode = prevNode.next.next;
            prevNode = prevNode.next;
        }

        return dummy.next;
    }
}
