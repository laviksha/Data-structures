
//read https://www.geeksforgeeks.org/a-program-to-check-if-a-binary-tree-is-bst-or-not/
public class Solution
{
    
    int max=Integer.MAX_VALUE;
    int  min=Integer.MIN_VALUE;
    //Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root)
    {
      return isBstUtil(root,min,max);
    }
    
    boolean isBstUtil(Node root,int min,int max){
        if(root==null) return true;
        if(root.data<min || root.data>max) return false;
        
        return (isBstUtil(root.left,min,root.data-1)&&isBstUtil(root.right,root.data+1,max));
    }
}
