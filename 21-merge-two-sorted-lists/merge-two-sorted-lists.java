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
        if(list1==null)return list2;
        if(list2==null)return list1;
        ListNode temp1=list1;
        if(list1.val>list2.val){
            temp1=list2;
            list2=list2.next;
        }
        else{
            list1=list1.next;
        }
        ListNode temp2=temp1;
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                temp2.next=list1;
                list1=list1.next;
            }
            else{
                temp2.next=list2;
                list2=list2.next;
            }
            temp2=temp2.next;
        }
        if(list1==null){
            temp2.next=list2;
        }
        else{
            temp2.next=list1;
        }
        return temp1;
    }
}