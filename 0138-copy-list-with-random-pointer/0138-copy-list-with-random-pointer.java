/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;

        Node curr = head; // Create new List w/ same values
        while(curr!=null){
            Node newNode = new Node(curr.val);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
        }
         curr = head;  // copy the random pointers
         while(curr!=null){
            if(curr.random !=null)
            curr.next.random = curr.random.next;
            curr = curr.next.next;
         }
         curr = head;
         Node newhead = head.next;
         Node newCurr= newhead;
         while(curr!=null){
             curr.next = newCurr.next;
             curr = curr.next;
             if(curr!=null){
                newCurr.next = curr.next;
                newCurr = newCurr.next;
             }
         }
return newhead;



        
    }
}