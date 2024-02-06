"""
Runtime: 34ms -> Beats 76.04% of users with Python
Memory: 16.56MB -> Beats 64.78% of user with Python
"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None:
            return head
        currentNode = head
        tmpVal = 0
        while currentNode != None and currentNode.next != None:
            tmpVal = currentNode.val
            currentNode.val = currentNode.next.val
            currentNode.next.val = tmpVal
            currentNode = currentNode.next.next
        return head