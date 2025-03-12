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
    private boolean carry;
    private ListNode result;
    private ListNode resultNow;
    private ListNode nowNode1;
    private ListNode nowNode2;
    private int sum;
    private int one;
    private int two;
    private int carryInt;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
 ;
      result=new ListNode();
      resultNow=result;
      carry=false;

      while(l1!=null || l2!=null)
      {
        one= l1!=null?l1.val:0;
        two= l2!=null?l2.val:0;
        carryInt=carry==true?1:0;
        sum = one + two + carryInt;
        //리스트 1, 2 각 노드 덧셈

        if(sum>=10)
        {
            sum-=10;
            carry=true;
        }
        else
        {
            carry=false;
        }
        //자리올림 처리

        
        //결과 리스트 노드 갱신

        if((l1!=null)||(l2!=null))
        {   
            resultNow.next = new ListNode(sum);
            resultNow=resultNow.next;
        }
        if(l1!=null)l1=l1.next;
        if(l2!=null)l2=l2.next;
        //각 리스트 별로 다음 노드 이동 
        
        
      }

      if(carry==true)
      {
        resultNow.next = new ListNode(1);    
      } 
        return result.next;
    }
}