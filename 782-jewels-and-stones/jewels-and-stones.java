class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        int n = jewels.length();
        char arr1[] = jewels.toCharArray();

        int m = stones.length();
        char arr2[] = stones.toCharArray();

        int count = 0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){

                if(arr2[i] == arr1[j]){
                    count++;
                    break;
                }
            }
        }

        return count;
        
    }
}