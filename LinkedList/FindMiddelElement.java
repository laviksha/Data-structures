int getMiddle(Node head)
    {
         Node prim=head;
         Node last=head;
         while(last!=null && last.next!=null ){
             prim=prim.next;
           //  if(last.next!=null){
             last=last.next.next;
            /* }else{
                 last=last.next;
             }*/
         }
         return prim.data;
    }
