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
    private static String findNum(ListNode head)
    {
        String num = "";

        ListNode currNode = head;
        while(currNode != null)
        {
            num += currNode.val;
            currNode = currNode.next;
        }

        return num;
    }

    private static String reverseString(String str, int index)
    {
        if(index == str.length())
            return "";
        
        return reverseString(str, index + 1) + Character.toString(str.charAt(index));
    }

    public boolean isPalindrome(ListNode head)
    {
        String num = findNum(head);
        
        if(num.equals(reverseString(num, 0)))
            return true;
        
        return false;
    }
}
