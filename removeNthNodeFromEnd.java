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
    public ListNode removeNthFromEnd(ListNode head, int n)
    {
        // finding the size of the Linked List
        ListNode currNode = head;
        int size = 0;
        while(currNode != null)
        {
            currNode = currNode.next;
            size++;
        }

        if(size == 1)
            return null;
        
        else if(size - n == 0)
            return head.next;

        ListNode prevNode = head;

        for(int i = 1 ; i < size - n ; i++)
            prevNode = prevNode.next;

        // deleting the nth node from the end
        prevNode.next = prevNode.next.next;

        return head;
    }
}
