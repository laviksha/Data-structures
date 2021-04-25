 public static int posOfRightMostDiffBit(int m, int n)
    {
        int index=0;
        while(true){
            index++;
            int nBit=n%2;
            int mBit=m%2;
            if(nBit!=mBit){
                return index;
            }
            n=n/2;
            m=m/2;
            
        }    
    }
