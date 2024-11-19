/*
Given an array of positive integers arr[], return the second largest element from the array. 
If the second largest element doesn't exist then return -1.

Note: The second largest element should not be equal to the largest element.
*/
class SecondLargest {
    public int getSecondLargest(int[] arr) {
        int len=arr.length;
        int l=arr[0],sl=Integer.MIN_VALUE;
        for(int i=0,j=len-1;i<=j;i++,j--){
            int t=arr[i],a=arr[j];
            if(t>l){
                sl=l;
                l=t;
            }
            else if(t>sl && t!=l)   sl=t;
            if(a>l){
                sl=l;
                l=a;
            }
            else if(a>sl && a!=l) sl=a;
        }
        if (sl==Integer.MIN_VALUE) return -1;
        return sl;
    }
}
