/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        
       ArrayList<Integer> ar=new ArrayList<Integer>();
        inorder(root,k,ar);
        return ar.get(k-1);
    }
    
    void inorder(TreeNode root,int k,ArrayList<Integer> ar){
        if(root==null) return;
        if(ar.size()==k) return;
        inorder(root.left,k,ar);
        ar.add(root.val);
        inorder(root.right,k,ar);
    }
}
