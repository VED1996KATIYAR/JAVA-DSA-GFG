class Solution {
    public int[] sortInWave(int arr[]) {
        // code here
         int start=0;
         int end=1;
         while((start<end)&&(end<arr.length)){
             int temp=arr[start];
             arr[start]=arr[end];
             arr[end]=temp;
             start+=2;
             end+=2;
         }
         return arr;
    }
}
