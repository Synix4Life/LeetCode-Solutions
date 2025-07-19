/*
* Runtime: 23ms -> Beats 16.34% of users with C
* Memory: 14.87MB -> Beats 63.99% of user with C
*/

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
int greatest_divisor(int i, int j){
    for(int k = (i>j)?j:i; k>0; k--){
        if(j%k == 0 && i%k == 0) return k;
    }
    return 1;
}

struct ListNode* insertGreatestCommonDivisors(struct ListNode* head) {
    struct ListNode* curr = head;
    while(curr->next != NULL){
        struct ListNode* new_node = malloc(sizeof(struct ListNode));
        if (!new_node) break;
        new_node->val = greatest_divisor(curr->val, curr->next->val);
        new_node->next = curr->next;
        curr->next = new_node;
        curr = new_node->next;
    }
    return head;
}