//method 1: using map 
import java.util.ArrayList;
import java.util.*;

public class Solution {

	public static int findDuplicate(ArrayList<Integer> arr) {

		//    Write your code here.
		Map<Integer,Integer> mp= new HashMap<>();
		for(Integer c: arr){
		    mp.put(c,mp.getOrDefault(c,0)+1);
		}
		for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
		    if(entry.getValue()==2){
		        int ans=entry.getKey();
		        return ans;
		    }
		}
		return -1;
		
	}
}

//method 2: USING XOR

import java.util.*;

public class Solution {

	public static int findDuplicate(ArrayList<Integer> arr) {

		//    Write your code here.
		int ans=0;
		for(int i=0;i<arr.size();i++){
			ans=ans^arr.get(i);
		}
		for(int i=1;i<arr.size();i++){
			ans=ans^i;
		}
		return ans;
		
	}
}
		
