package Tree;

public class TreeTraversal {
	static class  Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	Node root=null;
	public static void main(String[] args) {
		TreeTraversal ts=new TreeTraversal();
		 /* Let us create following BST
        50
     /     \
    30      70
   /  \    /  \
 20   40  60   80 */
		ts.insert(50);
		ts.insert(30);
		ts.insert(20);
		ts.insert(40);
		ts.insert(70);
		ts.insert(60);
		ts.insert(80);
		ts.inorder();
		ts.preOrder();
		ts.postOrder();

	}
	
	private  void insert(int i) {
		root=insertRec(i,root);
		
	}
	private Node insertRec(int key, Node root) {
		if(root==null) {
			return new Node(key);
		}
		
		if(key<root.data) {
			root.left=insertRec(key,root.left);
		}
		else if(key>root.data){
			root.right=insertRec(key, root.right);
		}
		return root;
		
	}
	private void inorder() {
		//Left root right
		System.out.println("**************Inorder Travesal ****");
		inorderRec(root);
		System.out.println("");
		
	}
	private void inorderRec(Node root) {
		if(root!= null)
		{
		inorderRec(root.left);
		System.out.print(root.data+" ");
		inorderRec(root.right);
		}
	}
	
	private void preOrder() {
		System.out.println("**************Preorder Travesal ****");
		preOrderRec(root);
		System.out.println("");
	}
	private void preOrderRec(Node root) {
		if(root!=null) {
		System.out.print(root.data+" ");
		preOrderRec(root.left);
		preOrderRec(root.right);
		}
	}
	private void postOrder() {
		System.out.println("**************Postorder Travesal ****");
		postOrderRec(root);
		System.out.println("");
	}

	private void postOrderRec(Node root) {
		if(root!=null) {
			postOrderRec(root.left);
			postOrderRec(root.right);
			System.out.print(root.data+" ");

		}
	}
	

}
