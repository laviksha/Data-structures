public static void convertToWave(int a[], int n){
        
        // Your code here
        for(int i=0;i<n;i+=2){
            if(i!=n-1){
            int temp=a[i+1];
            a[i+1]=a[i];
            a[i]=temp;
            }
        }
        
    }

/*
Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array and return it. In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5..... (considering the increasing lexicographical order).

Example 1:

Input:
n = 5
arr[] = {1,2,3,4,5}
Output: 2 1 4 3 5*/
