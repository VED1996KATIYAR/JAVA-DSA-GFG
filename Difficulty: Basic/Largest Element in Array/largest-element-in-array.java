class Solution {
    public static int largest(int[] arr) {
        // code here
        Arrays.sort(arr);
        int a=arr.length-1;
        return arr[a];
    }
}
