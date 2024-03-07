//method 1: using binary search
import java.util.* ;
import java.io.*; 
public class Solution {

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        //store the index which have value
        
        int s=0, e=n-1;
        int mid= s+ (e-s)/2;
        int first=-1;
        int[] arr1={-1,-1};
        while(s<=e){
            if(arr.get(mid)==k){
                first=mid;
                e=mid-1;
            }else if(k>arr.get(mid)){
                s=mid+1;
            }else if(k<arr.get(mid)){
                e=mid-1;
            }
            mid= s+ (e-s)/2;
        }
        arr1[0]=first;
        
        s=0;
        e=n-1;
        mid= s+ (e-s)/2;
        int last=-1;
        while(s<=e){
            if(arr.get(mid)==k){
                last=mid;
                s=mid+1;
            }else if(k>arr.get(mid)){
                s=mid+1;
            }else if(k<arr.get(mid)){
                e=mid-1;
            }
            mid= s+ (e-s)/2;
        }
        arr1[1]=last;
        return arr1;
    }

};

//method 2: 49/50 not all test cases passed
import java.util.* ;
import java.io.*; 
public class Solution {

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        //store the index which have value
        
        int[] ans = {-1,-1};
        for(int i=0;i<n;i++){
            if(arr.get(i)==k){
                ans[0]=i;
                break;
            }
                
        }
        for(int i=n-1;i>=0;i--){
            if(arr.get(i)==k){
                ans[1]=i;
                break;
            }
                
        }
        return ans;
    }

};

//method 3: predefined methods
import java.util.* ;
import java.io.*; 
public class Solution {

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        //store the index which have value
        int[] ans = new int[2];
        ans[0]=arr.indexOf(k);
        ans[1]=arr.lastIndexOf(k);
        return ans;
    }

};


