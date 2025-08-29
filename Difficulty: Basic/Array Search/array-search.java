class Solution {
    public int search(int arr[], int x) {
        // code here
        int index=-1;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}
