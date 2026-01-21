// Construct the Minimum Bitwise Array I
// You are given an array nums consisting of n prime integers.
// You need to construct an array ans of length n, such that, for each index i, the bitwise OR of ans[i] and ans[i] + 1 is equal to nums[i], i.e. ans[i] OR (ans[i] + 1) == nums[i].
// Additionally, you must minimize each value of ans[i] in the resulting array.
// If it is not possible to find such a value for ans[i] that satisfies the condition, then set ans[i] = -1.

class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int len = nums.size();
        int[] output = new int[len];
        for(int i=0;i<len;i++){
            int target = nums.get(i);
            for(int j=0;j<target;j++){
                output[i]=-1;
                if((j | (j+1))== target){
                    output[i]=j;
                    System.out.println(j);
                    break;
                }
            }
        }
        return output;
    }
}

// Construct the Minimum Bitwise Array II
class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int len = nums.size();
        int[] output = new int[len];
        for(int i=0;i<len;i++){
            int target = nums.get(i);
            if(target == 2){
                output[i]=-1;
                continue;
            }else{
                for(int j=1;j<32;j++){
                    if((target >> j & 1) == 0){
                        output[i]= target ^ (1 << (j -1));
                        break;
                    }
                }
            }      
        }
        return output;
        
    }
}
