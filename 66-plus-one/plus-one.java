class Solution {
    public int[] plusOne(int[] digits) {
        
        for(int i=digits.length-1; i>=0; i--){

         if(digits[i] < 9){              /* 1999  = 2000,3998 = 3999 and it goes on.......*/
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int arr[]  = new int[digits.length+1];   /* this three will excecute when the number is 9,99,999,9999.....*/

        arr[0] = 1;

        return arr;        
        
    }
}