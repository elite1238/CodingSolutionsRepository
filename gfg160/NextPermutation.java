/* 
Given an array of integers arr[] representing a permutation,
implement the next permutation that rearranges the numbers into the lexicographically next greater permutation.
If no such permutation exists, rearrange the numbers into the lowest possible order (i.e., sorted in ascending order). 
*/
import java.util.*;;
class NextPermutation {
    void nextPermutation(int[] arr) {
        // code here
        int j,f=1,n=arr.length;
        for(int i=n-1;i>=0;i--){
            if (i==n-1) continue;
            
            if(arr[i]>=arr[i+1]) continue;
            else{
                f=0;
                int k=n-1;
                while(arr[i]>=arr[k]) k--;
                j=arr[i];
                arr[i]=arr[k];
                arr[k]=j;
                Arrays.sort(arr,i+1,n);
                break;
            }
        }
        if (f==1){
            Arrays.sort(arr);
        }
    }
}
