# In problem they give nums array and target and we have find any of the two number from array 
  who gave the number target after adding and we have to return indices of that two number
  
  class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0;i<nums.length;i++) {        // we are running nested loop here 
            for(int j = i+1;j<nums.length;j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
           
        } return new int[]{-1,-1}; //not found
    }  
}
