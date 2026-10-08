class Solution {
    public int searchInsert(int[] nums, int target) { //[4, 88, 77, 97] 
        for(int i = 0; i<nums.length; i++){
            if(i == nums.length-1 && nums[i]<target)
            return i+1;
            if(nums[i]>=target){
                return i;
            } 
        }
        return -9999;
    }
}