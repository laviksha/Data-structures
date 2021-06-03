
//Time Complexity: O(n^2) in worst case. For a skewed tree, printGivenLevel() takes O(n) time where n is the number of nodes in the skewed tree. So time complexity of printLevelOrder() is O(n) + O(n-1) + O(n-2) + .. + O(1) which is O(n^2). 
//Space Complexity: O(n) in worst case. For a skewed tree, printGivenLevel() uses O(n) space for call stack. For a Balanced tree, the call stack uses O(log n) space, (i.e., the height of the balanced tree). 

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

