// User function Template for Java

class Solution {
    int[] segregate0and1(int[] arr) {
        // code here
        int nzero=0;
        int none=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]==0){
                nzero+=1;
            }
        }
        int i=0;
        while(i<nzero){
            arr[i]=0;
            i+=1;
        }
        while(i<arr.length){
            arr[i]=1;
            i+=1;
            
        }
        return arr;
    }
}
