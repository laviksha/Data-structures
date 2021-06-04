package Tree;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

import Tree.TreeTraversal.Node;

public class LeftView {
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
	static int maxLevel=0;
	public static void main(String[] args) {
		LeftView ts=new LeftView();
		 /* Let us create following BST
        50
           \
           70
          /  \
        60   80 */
	
		ts.insert(50);
		ts.insert(70);
		ts.insert(60);
		ts.insert(80);
		ts.levelOrderTraversal();
		ts.printLeftView();

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
	
	private void levelOrderTraversal() {
		levelOrderTraversal(root);
		levelOrderTraversalRecursion(root);
	}
	private void levelOrderTraversal(Node root1) {
		System.out.println("**************Level Travesal ****");
		Queue<Node> queue=new LinkedList<Node>();
		queue.add(root1);
		while(!queue.isEmpty()) {
			Node cur=queue.poll();
			System.out.print(cur.data+" ");
			if(cur.left!=null) {
			queue.add(cur.left);}
			if(cur.right!=null) {
			queue.add(cur.right);}
		}
		System.out.println();
	}
	
	private int height(Node root) {
		if(root== null ) {
			return 0;
		}
		return Integer.max(height(root.left), height(root.right))+1;
	}
	
	private void levelOrderTraversalRecursion(Node root1) {
		System.out.println("**************Level Travesalrecursion ****");
		int height=height(root1);
		System.out.println("Height of tree:"+height);
		for(int i=1;i<=height;i++) {
			levelOrderTraversalRecursion_(root1,i);
		}
		System.out.println();

		}

	private void levelOrderTraversalRecursion_(Node root1, int level) {
		if(root1==null) {
			return;
		}
		if(level==1) {
			System.out.print(root1.data+" ");
		}
		else if(level>1) {
		levelOrderTraversalRecursion_(root1.left,level-1);
		levelOrderTraversalRecursion_(root1.right,level-1);
		}
		
		
	}
// ******************************************	
	private void printLeftView() {
		System.out.println("**************Print left view (using level order traversal ) ****");
		printLeftView(root);
		System.out.println();
		System.out.println("**************Print left view (using queue ) ****");
		printLeftViewUsingQueue(root);
		System.out.println();
		System.out.println("**************Print left view (using recursion ) ****");
		printLeftViewUsingLevelOrderRecursion(root,1);
	}
	private void printLeftView(Node root1) {
		int height=height(root1);
		
		for(int i=1;i<=height;i++) {
			printLeftView_(root1,i,new HashSet<Integer>());
		}
	}

	private void printLeftView_(Node root1, int level,HashSet<Integer> hs) {
		if(root1==null || level == 0) return;
		if(level==1) {
			if(hs.isEmpty()) {
				System.out.print(root1.data +" ");
				hs.add(root1.data);
			}
		}
		else if(level>1) {
			if(root1.left!=null) {
			printLeftView_(root1.left,level-1,hs);}
			if(root1.right!=null) {
			printLeftView_(root1.right, level-1, hs);}
		}
	}
	
	private void printLeftViewUsingQueue(Node root1) {
		Queue<Node> q=new LinkedList<Node>();
		q.add(root1);
		while(!q.isEmpty()) {
			int curSize=q.size();
			for(int i=0;i<curSize;i++) {
				Node cur=q.poll();
				if(i==0) {
				System.out.print(cur.data+" ");
				
				}
				if(cur.left!=null)
					q.add(cur.left);
				if(cur.right!=null)
					q.add(cur.right);
			}
		}
	}
	private void printLeftViewUsingLevelOrderRecursion(Node root1,int level){
		if(root1==null || level ==0 ) return;
		if(maxLevel<level) {
			System.out.print(root1.data+" ");
			maxLevel=level;
		}
		printLeftViewUsingLevelOrderRecursion(root1.left,level+1);
		printLeftViewUsingLevelOrderRecursion(root1.right,level+1);
			
	}
	

}
