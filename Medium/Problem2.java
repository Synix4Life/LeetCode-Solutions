/*
* Runtime: 2ms -> Beats 24.45% of users with Java
* Memory: 42.95MB -> Beats 98.69% of user with Java
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int calc = 0;
        int over = 0;
        ListNode currentNode =null;
        ListNode firstNode=null;

        do{
            calc = (l1==null ? 0 :l1.val) + (l2==null ? 0 : l2.val) + over;
            over = 0;
            if(isOver(calc)){
                calc -= 10;
                over++;
            }
            if(currentNode == null){
                currentNode = new ListNode(calc);
                firstNode = currentNode;
            }
            else{
                currentNode.next = new ListNode(calc);
                currentNode = currentNode.next;
            }
            if(l1!=null){l1 = (l1.next==null? null: l1.next);}
            if(l2!=null){l2 = (l2.next==null? null: l2.next);}
            calc=0;
        }while(!(l1==null && l2==null));

        if(over==1){
            currentNode.next = new ListNode(1);
        }
        return firstNode;
    }
    private boolean isOver(int num){
        if(num>=10){
            return true;
        }
        return false;
    }
}
