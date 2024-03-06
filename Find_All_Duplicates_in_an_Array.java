//method 1: using map
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        Map<Integer, Integer> mp = new HashMap<>();
        for(Integer c: nums){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: mp.entrySet()){
            if(entry.getValue()!=1){
                int ans=entry.getKey();
                list1.add(ans);
            }
        }
        return list1;
    }
}
//method 2: 
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        List<Integer> list1 = new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                list1.add(nums[j]);
            }
        }
        return list1;
    }
    public static void swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
