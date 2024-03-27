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
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        //Approach:
        //Time: O(m + n)
        //Space: O(1)
        if(list1 == nullptr) {
            return list2;
        }
        
        if(list2 == nullptr) {
            return list1;
        }
        
        ListNode* ans = new ListNode();
        ListNode* curr = ans;
        
        while(list1 != nullptr || list2 != nullptr) {
            if(list1 == nullptr && list2 != nullptr) {
                ListNode* newNode = new ListNode(list2 -> val);
                curr -> next = newNode;
                curr = curr -> next;
                list2 = list2 -> next;
            } else if(list1 != nullptr && list2 == nullptr) {
                ListNode* newNode = new ListNode(list1 -> val);
                curr -> next = newNode;
                curr = curr -> next;
                list1 = list1 -> next;
            } else {
                if(list1 -> val < list2 -> val) {
                    ListNode* newNode = new ListNode(list1 -> val);
                    curr -> next = newNode;
                    curr = curr -> next;
                    list1 = list1 -> next;
                } else {
                    ListNode* newNode = new ListNode(list2 -> val);
                    curr -> next = newNode;
                    curr = curr -> next;
                    list2 = list2 -> next;
                }
            }
        }
        
        return ans -> next;
    }
};
