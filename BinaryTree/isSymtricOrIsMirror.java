 public static boolean isSymmetric(Node root)
    {
        // add your code here;
       return isMirror(root,root);
    }
   public static boolean isMirror(Node root1,Node root2){
       if(root1==null && root2==null) return true;
       if(root1==null || root2==null) return false;
       if((root1.data==root2.data) && isMirror(root1.left,root2.right) && isMirror(root1.right,root2.left)){
           return true;
       }
       return false;
   }
