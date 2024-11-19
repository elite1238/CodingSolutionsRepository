
class ReverseAnArray {
    public void reverseArray(int arr[]) {
        for(int i=0,j=arr.length-1;i<j;++i,--j){
            int t = arr[i];
            arr[i]=arr[j];
            arr[j]=t;
        }
    }
} 
