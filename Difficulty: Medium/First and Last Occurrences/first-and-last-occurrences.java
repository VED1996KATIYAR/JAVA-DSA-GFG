// User function Template for Java

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int start=0;
        int end=arr.length-1;
        int index=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]<x){
                start=mid+1;
            }else if(arr[mid]>x){
                end=mid-1;
            }else{
                index=mid;
                end=mid-1;
            }
        }
        ans.add(index);
        int star=0;
        int en=arr.length-1;
        int index1=-1;
        while(star<=en){
            int mid=(star+en)/2;
            if(arr[mid]<x){
                star=mid+1;
            }else if(arr[mid]>x){
                en=mid-1;
            }else{
                index1=mid;
                star=mid+1;
            }
        }
        ans.add(index1);
    return ans;
    }
}
