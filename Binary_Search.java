class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        int left=0;
        int right=n-1;
        int mid=(left+right)/2;
        while(left<=right){
            if(arr[mid]==k){
                return mid;
            }
            if(k>arr[mid]){
                left=mid+1;
            }else{
                right=mid-1;
            }
            mid=(left+right)/2;
        }
        return -1;
    }
}
