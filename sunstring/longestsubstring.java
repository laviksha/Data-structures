 int longestUniqueSubsttr(String s){
        String res=""+s.charAt(0);
        LinkedHashSet<Character> t=new LinkedHashSet<Character>();
        t.add(s.charAt(0));
        int maxTillNow=1;
        int curLength=1;
        for(int i=1;i<s.length();i++){
                        char cur=s.charAt(i);
            if(t.contains(cur)){
                if(maxTillNow<curLength) maxTillNow=curLength;
                int lastOc=t.headSet(cur).size();
              // System.out.println(lastOc);
                curLength-=(lastOc+1);
                for(int j=0;j<=lastOc;j++){t.pollFirst();}
            }
            t.add(cur);
            curLength++;
          // System.out.println("cur:"+cur+" curlength"+curLength+" max:"+maxTillNow+" t:"+t);

        }
        //for qwerty all length
        if(maxTillNow<curLength) maxTillNow=curLength;

        return maxTillNow;
    }
