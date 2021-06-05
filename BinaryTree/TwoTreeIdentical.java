boolean isIdentical(Node A, Node B)
	{
        if(A==null && B==null) return true;
        if((A==null && B!=null) || (A!=null && B==null)){
            return false;
        }
        
        if(A.data==B.data && isIdentical(A.left,B.left) && isIdentical(A.right,B.right)){
            return true;
        }
        return false;	
	    
	}
