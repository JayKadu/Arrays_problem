//method 1: using map then checking values if it is repeated by puting it in arraylist

import java.util.*;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int c: arr){
            mp.put(c, mp.getOrDefault(c,0)+1);
        }
        // for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
        //     System.out.println(entry.getKey() + ": " + entry.getValue());
        // }
        ArrayList am=new ArrayList();
        for(Map.Entry<Integer, Integer> entry: mp.entrySet()){
            
            if(am.contains(entry.getValue())){
                return false;
            }
            else{
                am.add(entry.getValue());
            }
        }
        System.out.println(am);
       
        return true;
    }
}

