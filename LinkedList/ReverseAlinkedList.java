 Node reverseList(Node head)
    {
        Node prev=null;
        Node next=null;
        Node cur=head;
        while(cur!=null ){
        next=cur.next;
        cur.next=prev;
        prev=cur;
        cur=next;
        }
     head=prev;
     return head;
     
    
        
    }
