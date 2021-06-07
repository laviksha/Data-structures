// ple 1:

/*Input:
            1
          /   \
         3     2
        /
       4           

Output: 2

Explanation:
Minimum depth is between nodes 1 and 2 since
minimum depth is defined as  the number of 
nodes along the shortest path from the root 
node down to the nearest leaf node.*/

int minDepth(Node root)
	{
	    //code here
	    Queue<Node> q=new LinkedList<Node>();
	    q.add(root);
	    int curLevel=0;
	    while(!q.isEmpty()){
	        int size=q.size();
	        for(int i=0;i<size;i++){
	        Node cur=q.poll();
	        if(cur.left==null && cur.right==null){
	            return curLevel+1;
	        }
	        if(cur.left!=null) q.add(cur.left);
	        if(cur.right!=null) q.add(cur.right);
	           
	        }
	        curLevel++;
	    }
	    return curLevel;
	}
	
