//https://www.geeksforgeeks.org/diameter-of-a-binary-tree/
//Function to return the diameter of a Binary Tree.
    int diameter(Node root) {
        // Your code here
        if(root == null ) return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        
        int ldiameter=diameter(root.left);
        int rdiameter=diameter(root.right);
         /* Return max of following three
          1) Diameter of left subtree
          2) Diameter of right subtree
          3) Height of left subtree + height of right subtree + 1
         */
        return Integer.max(lh+rh+1,Integer.max(ldiameter,rdiameter));
    }
    
    int height(Node root){
        if(root==null) return 0;
        return Integer.max(height(root.left),height(root.right))+1;
    }
