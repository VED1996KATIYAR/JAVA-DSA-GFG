// User function Template for Java

class Solution {
    int countZeroes(int[] arr) {
        // code here
        Arrays.sort(arr);
        int ctr=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                ctr+=1;
            }
        }
        return ctr;
    }
}
