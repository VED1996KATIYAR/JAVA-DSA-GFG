// User function Template for Java

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static int[] rotateArr(int arr[], int d) {
        // add your code here
        d=d%arr.length;
        int i=0;
        int j=d-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        int k=d;
        int l=arr.length-1;
        while(k<l){
            int tempo=arr[k];
            arr[k]=arr[l];
            arr[l]=tempo;
            k++;
            l--;
        }
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int t=arr[start];
            arr[start]=arr[end];
            arr[end]=t;
            start++;
            end--;
        }
        return arr;
    }
}