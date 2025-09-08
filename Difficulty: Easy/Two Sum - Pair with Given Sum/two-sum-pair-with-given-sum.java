import java.util.Arrays;
class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        int start=0;
        int end=arr.length-1;
        Arrays.sort(arr);
        while(start<end){
            int sum=arr[start]+arr[end];
            if(sum==target){
                return true;
            }else if(sum>target){
                end-=1;
            }else{
                start+=1;
            }
        }
        return false;
    }
}