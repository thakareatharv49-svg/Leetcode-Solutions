/* Problem: Count hills and valleys in an array ignoring duplicates.
   Approach: Brute force using list.*/

class Solution {
    public int countHillValley(int[] nums) {

        // Step 1: Remove duplicates
        ArrayList<Integer> list = new ArrayList<>();  //make a arraylist
        list.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {   /*runs a for loop and check the number with previous number
                                                      if the number is differny then add it in the arraylist*/
            if (nums[i] != nums[i - 1]) {             
                list.add(nums[i]);
            }
        }

        int count = 0;  //initialize count with zero

        // Step 2: Check hill & valley
        for (int i = 1; i < list.size() - 1; i++) {      /* check the current number with previous and next number 
           int prev = list.get(i - 1);                       if the current number is bigger or smaller the count plus 1*/ 
            int curr = list.get(i);
            int next = list.get(i + 1);
            if (curr > prev && curr > next) {
                count++; // hill
            } else if (curr < prev && curr < next) {
                count++; // valley
            }
        }

        return count;
    }
}
