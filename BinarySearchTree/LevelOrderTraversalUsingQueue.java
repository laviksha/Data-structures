private void levelOrderTraversal(Node root) {
		System.out.println("**************Level Travesal ****");
		Queue<Node> queue=new LinkedList<Node>();
		queue.add(root);
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
