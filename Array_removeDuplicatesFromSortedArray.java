class Solution {
    public int removeDuplicates(int[] nums) {
        // nums = [0,1,0,1,1,2,2,3,3,4]
        int index = 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1])
                nums[index++] = nums[i+1];
        }
        return index;
    }
}
