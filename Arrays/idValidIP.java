//test case 0.0.0.0 --> true  00.00.00.00 invalid, 0.0.0.0.  -> invalid(extra dot)  

public boolean isValid(String s) {
        // Write your code here
        String[] splitted=s.split("\\.");
              //      System.out.println(splitted);
        int sumOfdigit=0;
        if(splitted.length!=4) return false;
        
        for(String s1:splitted){
           // System.out.println(s1);
        if(s1.length()>3 || s1.equals("00") || s1.equals("000")) return false;
          
          int x=0;
          try{
           x=Integer.parseInt(s1);}
          catch(Exception e){
              return false;
          }
          if(x>255 || (x!=0 && s1.charAt(0)=='0')) return false;
          sumOfdigit+=s1.length();
        }
        if(s.length()!=(sumOfdigit+3)) return false;
        
        return true;
    }
