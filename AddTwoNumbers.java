package data-structures;

public class AddTwoNumbers {
   
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int a=0,b=0;
            int c = 0;
            ListNode result = new ListNode();
            ListNode current = result;
            while (l1 != null || l2!=null || c !=0){
                if (l1 == null){
                    a = 0;
                } else{
                    a = l1.val;
                }
                if (l2 == null) {
                    b = 0;
                } else{
                    b = l2.val;
                }
                current.next = new ListNode((a+b+c) % 10);
                c = (a+b+c)/10;
    
                //update the ptrs
                if (l1 != null)  l1 = l1.next;
                if (l2 != null)  l2 = l2.next;
                current = current.next;
    
            }
    
            return result.next;
    }
}


class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
