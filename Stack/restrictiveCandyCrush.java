class Solution
{
    public static String reduced_String(int k, String s)
    {
    Stack<Character> st=new Stack<Character>();
    if(s.length()==0 || k==1)  return "";
    st.add(s.charAt(0));
    for(int i=1;i<s.length();i++){
        
        if(!st.isEmpty() && st.peek()==s.charAt(i)){
            int j=1;
            Stack<Character> temp=new Stack<Character>();
            for(j=1;j<k;j++){
                if(st.isEmpty()){
                    break;
                }
                if(st.peek()==s.charAt(i)){
                    temp.add(st.pop());
                }
                else{
                    break;
                }
            }
            if(j==k){
                continue;
            }
                temp.forEach(plate -> {
            st.push(plate);
        });
            
        }
        st.push(s.charAt(i));
    }
    StringBuilder res=new StringBuilder();
    st.forEach(ele -> {
        res.append(ele);
    });
    return res.toString();
    }
}
