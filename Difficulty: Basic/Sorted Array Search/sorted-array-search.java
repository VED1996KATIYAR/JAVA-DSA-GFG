class Solution {
    static boolean searchInSorted(int arr[], int k) {
        // Your code here
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>k){
                end=mid-1;
            }else if(arr[mid]<k){
                start=mid+1;
            }else{
                return true;
            }
        }
        return false;
    }
}