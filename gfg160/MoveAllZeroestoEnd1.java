/*
Given an array arr[]. 
Push all the zeros of the given array to the right end of the array while maintaining the order of non-zero elements.
 Do the mentioned change in the array in place. 
 */
public class MoveAllZeroestoEnd {
    void pushZerosToEnd(int[] arr) {
        int n = arr.length,start=-1,stop=-1;
        int[] z = new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]==0 && start==-1){
                start=0;
                stop=0;
                z[0]=i;
            }
            else if(arr[i]==0) z[++stop]=i;
            else if (start==-1 || start>stop) continue;
            else{
                arr[z[start++]]=arr[i];
                arr[i]=0;
                z[++stop]=i;
            }
        }
    }
}
