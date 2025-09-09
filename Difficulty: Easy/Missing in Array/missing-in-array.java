class Solution {
    long missingNum(int arr[]) {
        // code here
     long l=arr.length+1;
     long sum=((l)*(l+1))/2;
     long s=0;
     for(int i=0;i<=arr.length-1;i++){
         s+=arr[i];
     }
     return(int)( sum-s);
    }
}