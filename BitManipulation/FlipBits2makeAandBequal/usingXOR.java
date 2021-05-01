public static int countBitsFlip(int a, int b){
        
    //take xor and count set bits
       int x=a^b;
       int count=0;
       while(x>0){
           if(x%2==1){
               count++;
           }
           x=x/2;
       }
        return count;
    }
