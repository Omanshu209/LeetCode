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

// Solution 1 (more faster and takes lesser memory)
// For Small Linked Lists

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

// Solution 2
// For Large Linked Lists

import java.math.BigInteger;
 
class Solution
{
    public static String findNum(ListNode head)
    {
        String num = "";
        
        ListNode currNode = head;
        while(currNode != null)
        {
            num = currNode.val + num;
            currNode = currNode.next;
        }

        return num;
    }

    public static ListNode createLinkedList(String num)
    {
        ListNode head = new ListNode(((int) num.charAt(num.length() - 1)) - 48);
        num = num.substring(0, num.length() - 1);

        ListNode prevNode = head, currNode = null;

        while(num.length() > 0)
        {
            currNode = new ListNode(((int) num.charAt(num.length() - 1)) - 48);
            prevNode.next = currNode;
            prevNode = currNode;

            num = num.substring(0, num.length() - 1);
        }

        return head;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        BigInteger num1 = new BigInteger(findNum(l1));
        BigInteger num2 = new BigInteger(findNum(l2));
        
        String sum = num1.add(num2).toString();
        
        return createLinkedList(sum);
    }
}
