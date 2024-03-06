//method 1: using pointers
import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        //Write your code here
        int low=0;
        int high=arr.length-1;
        int mid=0;
        while(mid<=high){
            switch(arr[mid]){
                case 0:
                    swap(arr,low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr,mid, high);
                    high--;
                    break;
            }
        }
    }
    public static void swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}

//method 2: counting and traversing
import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        //Write your code here
        int countZero=0;
        int countOne=0;
        int countTwo=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                countZero++;
            else if(arr[i]==1)
                countOne++;
            else
                countTwo++;
            
        }
        for(int i=0;i<arr.length;i++){
            if(i<countZero)
                arr[i]=0;
            else if(i<countZero+countOne)
                arr[i]=1;
            else
                arr[i]=2;   
        }
    }
}
