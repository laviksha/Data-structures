//A tree is height balanced if difference between heights of left and right subtrees is not more than one for all nodes of tree. 
    
//Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root)
    {
	// Your code here
	if(root==null) return true;
	if( (Math.abs(height(root.left)-height(root.right))<=1) && isBalanced(root.left) && isBalanced(root.right)) {
	    return true;
	}

	return false;
    }

 int height(Node root){
        if(root==null) return 0;
        return Integer.max(height(root.left),height(root.right))+1;
    }
