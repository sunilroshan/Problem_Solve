class Solution {
    public int kthGrammar(int n, int k) {

        //by using recursion

        if(n == 1 || k == 1){
            return 0;
        }
        
        int bit = kthGrammar(n - 1, (k + 1) / 2);
        
        if(k % 2 != 0){
            bit = bit;
        }
        else{
            bit = 1 - bit;
        }

        return bit;
    }
}