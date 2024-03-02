//find unique element in an array where other elements are repeated twice and one number is repeated only once we have to find that element

//method:1 using XOR --- O(n)
public class Solution{  

    public static int findUnique(int[] arr){
		//Your code goes here
      int ans=0;
      for(int i=0;i<arr.length;i++){
        ans=ans^arr[i];
      }
      return ans;
    }
}


//method: 2 using arrays.sort first then adding element with even index and substracting element with odd index
import java.lang.Math;
import java.util.Arrays;
public class Solution{  

    public static int findUnique(int[] arr){
		//Your code goes here
      Arrays.sort(arr);
      int sum=0;
      for(int i=0;i<=arr.length-1;i++){
        if(i%2==0){
            sum+=arr[i];
        }else{
          sum-=arr[i];
        }
      }
      return Math.abs(sum);
    }
}
