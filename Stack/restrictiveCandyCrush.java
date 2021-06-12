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





///better solution

/*Initialize a stack of pair<char, int>, to store characters and their respective consecutive frequencies.
Iterate over the characters of the string.
If the current character is different from the character present currently at the top of the stack, then set its frequency to 1.
Otherwise, if the current character is the same as the character at the top of the stack, then increase its frequency by 1.
If the frequency of the character at the top of the stack is K, pop that out of the stack.
Finally, print the characters which are remaining in the stack as the resultant string.*/
class Solution
{
    public static String reduced_String(int k, String s)
    {
    Stack<Pair> st=new Stack<Pair>();
    if(s.length()==0 || k==1) return "";
    for(int i=1;i<s.length();i++){
        char c=s.charAt(i);
        if(st.size()==0){
            st.push(new Pair(c,1);
            continue;
        }
        
        if(st.peek()==c){
            Pair p=st.pop();
            int cur=p.f+1;
            if(cur==k) continue;
            st.push(c,p.f+1);
        }
        else{
            st.push(c,new Pair(c,1));
        }
        
         String ans = "";
        while (st.size() > 0) {
            char c = st.peek().c;
            int cnt = st.peek().ctr;
            while (cnt-- > 0)
                ans = c + ans;
            st.pop();
        }
        return ans;
    }
    }
    
    static class Pair{
        int f;
        char c;
        Pair(char c,int f){
            this.c=c;
            this.f=f;
        }
    }
