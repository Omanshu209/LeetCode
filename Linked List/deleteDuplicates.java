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

import java.util.HashSet;

class Solution
{
    public ListNode deleteDuplicates(ListNode head)
    {
        if(head == null || head.next == null)
            return head;

        HashSet<Integer> set = new HashSet<>();
        set.add(head.val);

        ListNode prevNode = head, currNode = head.next;

        do
        {
            if(set.contains(currNode.val))
            {
                prevNode.next = currNode.next;
                currNode = prevNode.next;
                continue;
            }

            else
                set.add(currNode.val);
            
            currNode = currNode.next;
            prevNode = prevNode.next;
        }
        while(currNode != null);

        return head;
    }
}
