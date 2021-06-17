String longestCommonPrefix(String arr[], int n){
        // code here
        Arrays.sort(arr);
        String temp=arr[0];
        while(temp.length()>0){
            boolean flag=true;
        for(int i=1;i<n;i++){
            if(!arr[i].contains(temp)){
                flag=false;
                break;
            }
        }
        if(flag==true) return temp;
        int size=temp.length();
        if(size==2){
            break;
        }
        temp=temp.substring(0,size-1);
        }
        return "-1";
    }

/*N = 4
arr[] = {geeksforgeeks, geeks, geek,
         geezer}
Output: gee
Explanation: "gee" is the longest common
prefix in all the given strings*/
