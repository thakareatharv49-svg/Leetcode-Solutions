# In this problem they gave array digits and we have to add 1 in this
  example we have 1,2,3 separate digits in an array so what we have to do is to add 1 so the result is 1,2,4.
  
  class Solution {
    public int[] plusOne(int[] digits) {

  # Creating for loop from right to left
  # we traversed from right to left on every digit and if the digit is less than 9 we add 1 in digits and return the digits
    
        for(int i = digits.length - 1;i >= 0;i--) {
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
    #if at once place there is 9 then we place there 0 and shifting on left digits and then add 1 in it
              
             digits[i] = 0;
        }
    #and if all the digits are 9 then we will create the new array result and also increase the length of array by 1
      and at index 0 we place 1 and then automatically at other index 0 will place and then return result
      
        int[] result = new int[digits.length + 1];
        result[0]= 1;

        return result;

    }
    
}
