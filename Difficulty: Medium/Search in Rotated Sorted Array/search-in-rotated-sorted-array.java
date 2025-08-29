class Solution {
    int search(int[] arr, int key) {
        // code here
        int k=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            if(arr[start]==key){
                return start;
            }if(arr[end]==key){
                return end;
            }
            start++;
            end--;
        }
        return k;
    }
}