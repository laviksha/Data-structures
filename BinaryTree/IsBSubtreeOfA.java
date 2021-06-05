//Using queue -- time complexity
 public static boolean isSubtree(Node T, Node S) {
        // add code here.
        Queue<Node> q=new LinkedList<Node>();
        q.add(T);
        while(!q.isEmpty()){
            Node cur=q.poll();
            if(cur.data==S.data){
                 if(checkIfIdentical(cur,S))
                    return true;
            }
            if(cur.left!=null) q.add(cur.left);
            if(cur.right!=null) q.add(cur.right);
            
        }
        return false;
    }
    
    public static boolean checkIfIdentical(Node A,Node B){
        if(A==null && B==null) return true;
        if((A==null && B!=null) || (A!=null && B==null)){
            return false;
        }
        
        if(A.data==B.data && checkIfIdentical(A.left,B.left) && checkIfIdentical(A.right,B.right)){
            return true;
        }
        return false;
    }
