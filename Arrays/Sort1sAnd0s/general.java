 public static void sort01(int a[], int n)
    {
        int low=0;
        int high=n-1;
        while(high>low){
            if(a[low]==1 && a[high]==0){
                 int temp=a[high];
                a[high]=a[low];
                a[low]=temp;
                low++;
            }
            else if(a[high]==1 && a[low]==0){
               low++;
               high--;
            }
            else if(a[high]==0 && a[low]==0){
               low++;
               
            }
            else{
                high--;
            }
        }

    }
