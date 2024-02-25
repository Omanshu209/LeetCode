/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

import java.util.HashSet;

public class Solution
{
    public ListNode detectCycle(ListNode head)
    {
        HashSet<ListNode> set = new HashSet<ListNode>();

        while(head != null)
        {
            if(set.contains(head))
                return head;
            set.add(head);

            head = head.next;
        }

        return null;
    }
}
