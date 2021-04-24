public static boolean isPowerofTwo(long n){
        
        int countOfOne=0;
        if(n==0) return false;
        while(n>0){
            long mod=n%2;
            if(mod==1) countOfOne++;
            if(countOfOne>1) return false;
            n=n/2;
        }
        return true;
    }
