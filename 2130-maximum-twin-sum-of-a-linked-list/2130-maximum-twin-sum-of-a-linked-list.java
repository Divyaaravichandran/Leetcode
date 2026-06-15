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
    public int pairSum(ListNode head) {
        ArrayList<Integer> a = new ArrayList<>();
        ListNode curr = head;
        while(curr!=null){
            a.add(curr.val);
            curr = curr.next;
        }
        int s = a.size()-1;
        int m = 0;
        for(int i=0;i<a.size()/2;i++){
            int sum = a.get(i)+a.get(s);
            s--;
            m = Math.max(m,sum);
        }
        return m;
    }
}