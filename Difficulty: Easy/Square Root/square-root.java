class Solution {
    int floorSqrt(int n) {
        // code here
        int root=0;
        for(int i=0;i<=n;i++){
            if(i*i==n){
                return i;
            }
            
            if((i*i)>n){
                root=i-1;
                break;
            }
        }
        return root;
    }
}