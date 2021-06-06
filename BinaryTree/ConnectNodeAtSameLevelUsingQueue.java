 public void connect(Node root1)
    {
       Queue<Node> q=new LinkedList<Node>();
       q.add(root1);
       root.nextRight=null;
       while(!q.isEmpty()){
           int curSize=q.size();
           
           for(int i=0;i<curSize;i++){
               Node cur=q.poll();
               if(i==curSize-1)
                cur.nextRight=null;
               else 
                 cur.nextRight=q.peek();
               if(cur.left!=null) q.add(cur.left);
               if(cur.right!=null) q.add(cur.right);
           }
       }
    }
