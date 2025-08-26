// User function Template for Java
class Solution {
    static long isPerfectSquare(long n) {
        // code here
        long start=1;
        long end=n;
        while(start<=end){
            long mid=(start+end)/2;
            if(mid*mid==n){
                return 1;
            }else if(mid*mid<n){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return 0;
    }
}