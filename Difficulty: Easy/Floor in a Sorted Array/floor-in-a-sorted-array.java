class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int start=0;
        int end=arr.length-1;
        int index=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>x){
                end=mid-1;
            }if(arr[mid]<=x){
                index=mid;
                start=mid+1;
            }
        }
        return index;
    }
}
