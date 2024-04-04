/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    void reorderList(ListNode* head) {
        if(!head || !head->next) return;
        ListNode* fast = head;
        ListNode* slow = head;
        ListNode *prev = head;
        while(fast && fast->next){
            prev = slow;
            fast = fast->next->next;
            slow = slow->next;
        }
        prev->next = NULL;
        ListNode* list1 = head;
        ListNode* list2 = reverse(slow);
        merge(list1, list2);
    }
private:
    void merge(ListNode* list1, ListNode* list2){
        while(list2){
            ListNode* next = list1->next;
            list1->next = list2;
            list1 = list2;
            list2 = next;
        }
    }
    ListNode* reverse(ListNode* head){
        if(!head) return nullptr;
        ListNode* prev = nullptr;
        ListNode* curr = head;
        ListNode* next = nullptr;
        while(curr){
            next = curr->next;
            curr->next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
};
