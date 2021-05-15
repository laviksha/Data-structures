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

	}
	private void inorder() {
		//Left root right
		inorderRec(root);
		
	}
	private void inorderRec(Node root) {
		if(root!= null)
		{
		inorderRec(root.left);
		System.out.println(root.data);
		inorderRec(root.right);
		}
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
	
	

}
