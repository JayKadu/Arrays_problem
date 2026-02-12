// 16. 3Sum Closest
// Given an integer array nums of length n and an integer target, find three integers at distinct indices in nums such that the sum is closest to target.
// Return the sum of the three integers.
// You may assume that each input would have exactly one solution.

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = 1 << 30;
        int numsLength = nums.length;
        for(int i=0;i< numsLength;i++){
            int left = i + 1;
            int right = numsLength -1;
            while (left < right){
                int currentSum = nums[i] + nums[left] + nums[right];

                if(currentSum == target){
                    return currentSum;
                }
                if(Math.abs(currentSum - target) < Math.abs(min - target)){
                    min = currentSum;
                }
                if(currentSum > target){
                    --right;
                }else{
                    ++left;
                }
            }
        }
        return min;
    }
}
