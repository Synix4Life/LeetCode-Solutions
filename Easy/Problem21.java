/*
* Runtime: 0ms -> Beats 100% of users with Java
* Memory: 40.98MB -> Beats 99.60% of user with Java
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode firstNode = null;
        ListNode currentNode = null;
        while(true){
            if(list1==null && list2==null){
                break;
            }
            if((list1==null? 101: list1.val)>=(list2==null? 101:list2.val)){
                if(currentNode == null){
                    currentNode = list2;
                    firstNode = currentNode;
                }
                else{
                    currentNode.next = list2;
                    currentNode = currentNode.next;
                }
                list2 = list2.next;
            }
            else{
                if(currentNode == null){
                    currentNode = list1;
                    firstNode = currentNode;
                }
                else{
                    currentNode.next = list1;
                    currentNode = currentNode.next;
                }
                list1 = list1.next;
            }
        }
        return firstNode;
    }
}
