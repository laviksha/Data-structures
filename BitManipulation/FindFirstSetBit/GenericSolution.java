unsigned int getFirstSetBit(int n)
    {
        int count=0;
        if(n==0) return 0;
        while(true){
            if(n%2==1){
                return count+1;
            }
            count++;
            n=n/2;
        }
    }
