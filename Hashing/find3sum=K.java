/*
Traverse the array from start to end. (loop counter i)
Create a HashMap or set to store unique pairs.
Run another loop from i+1 to end of the array. (loop counter j)
If there is an element in the set which is equal to x- arr[i] – arr[j], then print the triplet (arr[i], arr[j], x-arr[i]-arr[j]) and break
Insert the jth element in the set.
*/


public static boolean find3Numbers(int a[], int n, int X) { 
    
       // Your code Here

       for(int i=0;i<n-2;i++){
           HashSet<Integer> h=new HashSet<Integer>();
           int curSum=X-a[i];
           for(int j=i+1;j<n;j++){
               if(h.contains(curSum-a[j])){
                   return true;
               }
               h.add(a[j]);
           }
       }
       return false;
    
    }
