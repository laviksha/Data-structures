public int kthLargest(Node root,int k)
    {
        //Your code here
             
       ArrayList<Integer> ar=new ArrayList<Integer>();
        inorder(root,k,ar);
        return ar.get(k-1);
    }
    
    void inorder(Node root,int k,ArrayList<Integer> ar){
        if(root==null) return;
        if(ar.size()==k) return;
        inorder(root.right,k,ar);
        ar.add(root.data);
        inorder(root.left,k,ar);
    }
