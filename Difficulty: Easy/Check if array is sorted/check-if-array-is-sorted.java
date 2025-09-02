class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            if(start==end){
                break;
            }
            if(arr[start]>arr[start+1]){
                return false;
            }else{
                start+=1;
            }
        }
        return true;
    }
}