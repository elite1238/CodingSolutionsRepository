/*
Given an unsorted array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.

Note: Consider the array as circular.
 */

 class RotateArray {
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d=d%n;
        int[] a = new int[d];
        for(int i=0;i<d;i++){
            a[i]=arr[i];
        }
        for(int j=0,i=d;i<n;i++,j++){
            arr[j]=arr[i];
        }
        for(int i=0,j=n-d;j<n;j++,i++){
            arr[j]=a[i];
        }
        
    }
}
