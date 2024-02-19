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
    public static long findNum(ListNode head)
    {
        long num = 0, mul = 1;
        
        ListNode currNode = head;
        while(currNode != null)
        {
            num += currNode.val * mul;
            currNode = currNode.next;
            mul *= 10;
        }

        return num;
    }

    public static ListNode createLinkedList(long num)
    {
        ListNode head = new ListNode((int) (num % 10));
        num /= 10;

        ListNode prevNode = head, currNode = null;

        while(num > 0)
        {
            currNode = new ListNode((int) (num % 10));
            prevNode.next = currNode;
            prevNode = currNode;

            num /= 10;
        }

        return head;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        long sum = findNum(l1) + findNum(l2);
        return createLinkedList(sum);
    }
}
