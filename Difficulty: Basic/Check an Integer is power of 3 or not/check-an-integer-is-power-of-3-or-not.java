// User function Template for Java
class Solution {
    static String isPowerof3(int N) {
        // code here
        while(N!=1){
            if(N%3!=0){
                return "No";
            }
            N/=3;
        }
        return "Yes";

    }
}