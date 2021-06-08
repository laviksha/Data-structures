// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.util.HashMap;
import java.io.*;

    class Node
    {
        int data;
        Node left,right;
        Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
    }
		
public class GFG2
{
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    
	public static void inorder(Node root)
	{
	    if(root==null)
	    return;
	    inorder(root.left);
	    System.out.print(root.data);
	    inorder(root.right);
	}
     /* Drier program to test above functions */
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
        	    GFG g = new GFG();
			
			    ArrayList<Integer> res = g.zigZagTraversal(root) ;
			    for (int i = 0; i < res.size (); i++)
			        System.out.print (res.get (i) + " ");
			    System. out. println();  
    			
                t--;
            
        }
	}
}// } Driver Code Ends


//User function Template for Java

/*class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/

class GFG
{
    boolean startFromLeft=true; 
    //Function to store the zig zag order traversal of tree in a list.
	int height(Node root){
	    if(root==null) return 1;
	    return Integer.max(height(root.left),height(root.right))+1;
	}
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    ArrayList<Integer> ar=new ArrayList<Integer>();
	    int h=height(root);
    	    for(int i=1;i<=h;i++){
    	        
    	            zigZagTraversal(root,i,ar,startFromLeft);
    	             if(startFromLeft) startFromLeft=false;
    	    else startFromLeft=true;
    	        
    	    }
    return ar;	   
    	    
	}
	
	void zigZagTraversal(Node root,int h,ArrayList<Integer> ar,boolean startFromLeft){
	    if(root==null) return;
	    if(h==1){
	        ar.add(root.data);
	    }
	    else if(h>1){
	   if(startFromLeft){
	           	         zigZagTraversal(root.left,h-1,ar,true);
    	        zigZagTraversal(root.right,h-1,ar,true);

	   } 
	   else{
	               zigZagTraversal(root.right,h-1,ar,false);
    	        zigZagTraversal(root.left,h-1,ar,false);
	   }
	    }
	}
	
	
}
