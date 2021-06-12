 int longestUniqueSubsttr(String s){
          public int lengthOfLongestSubstring(String s) {
      //  String res=""+s.charAt(0);
        if(s.length()==0) return 0;
        LinkedHashMap<Character,Integer> t=new LinkedHashMap<Character,Integer>();
        t.put(s.charAt(0),0);
        int maxTillNow=1;
        int curLength=1;
        for(int i=1;i<s.length();i++){
                        char cur=s.charAt(i);
            if(t.containsKey(cur)){
                if(maxTillNow<curLength) maxTillNow=curLength;
                int lastOc=t.get(cur);
              // System.out.println(lastOc);
                        Iterator hm = t.entrySet().iterator();
                        HashSet<Character> temp=new HashSet<Character>();
                while(hm.hasNext()){
                    Map.Entry mapElement = (Map.Entry)hm.next();
                    temp.add((Character)mapElement.getKey());
                    if((Character)mapElement.getKey()==cur) break;
                    lastOc--;
                }
                t.keySet().removeAll(temp);
                    
                curLength=t.size();
            }
            t.put(cur,i);
            curLength++;
          //System.out.println("cur:"+cur+" curlength"+curLength+" max:"+maxTillNow+" t:"+t);

        }
        //for qwerty all length
        if(maxTillNow<curLength) maxTillNow=curLength;

        return maxTillNow;
    }
