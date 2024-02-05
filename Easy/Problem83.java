/*
* Runtime: 0ms -> Beats 100% of users with Java
* Memory: 42.95MB -> Beats 96.68% of user with Java
*/

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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = (head!=null? new ListNode(head.val):null);
        ListNode first = current;
        while(head!=null){
            if(current.val!=head.val){
                current.next = new ListNode(head.val);
                current = current.next;
            }
            head=head.next;
        }
        return first;
    }
}
