// 3010. Divide an Array Into Subarrays With Minimum Cost I
// You are given an array of integers nums of length n.
// The cost of an array is the value of its first element. For example, the cost of [1,2,3] is 1 while the cost of [3,4,1] is 3.
// You need to divide nums into 3 disjoint contiguous subarrays.
// Return the minimum possible sum of the cost of these subarrays.

class Solution {
    public int minimumCost(int[] nums) {
        int first =nums[0];
        int second = 50;
        int third = 50;
        for(int i=1;i<nums.length;++i){
            if(nums[i]< second){
                third = second;
                second = nums[i];
            }else if(nums[i]< third){
                third = nums[i];
            }
        }
        return first + second + third;
    }
}
