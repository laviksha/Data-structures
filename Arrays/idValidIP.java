  public boolean isValid(String s) {
        // Write your code here
        String[] splitted=s.split("\\.");
              //      System.out.println(splitted);
int sumOfdigit=0;
if(splitted.length!=4) return false;
        for(String s1:splitted){
           // System.out.println(s1);
            if(s1.length()>3) return false;
          int x=0;
          try{
           x=Integer.parseInt(s1);}
          catch(Exception e){
              return false;
          }
          if(x>255) return false;

          sumOfdigit+=3;
        }
        
        return true;
    }
}
