class Solution {
    public int[] plusOne(int[] digits) {
        //int last = digits.length-1;
        for (int i=digits.length-1;i>=0;i--){
            if (digits[i] +1 != 10){
            digits[i]=  digits[i] + 1;
            return digits; 
            }
            digits[i]=0;

        }
        
        int [] newdigits = new int[digits.length+1];
        newdigits[0]=1;
        return newdigits;
       
    }
}