// User function Template for Java

class Solution {
    static int countSquares(int n) {
        // code here
        int i=1;
        int j=n/2;
        int ctr=0;
        while(i<=j){
            if(i*i<n){
                ctr+=1;
                i++;
            }if(i*i>=n){
                break;
            }
        }
        return ctr;
    }
}