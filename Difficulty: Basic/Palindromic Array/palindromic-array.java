/*Complete the Function below*/
class Solution {
    public static boolean isPalinArray(int[] arr) {
        // add code here.
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            int sum=0;
            while(temp!=0){
                int mod=temp%10;
                sum=(sum*10)+mod;
                temp/=10;
            }
            if(sum!=arr[i]){
                return false;
            }
        }
        return true;
    }
}