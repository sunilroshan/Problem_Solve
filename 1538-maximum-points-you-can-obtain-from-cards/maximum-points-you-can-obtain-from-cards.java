class Solution {
    public int maxScore(int[] cardPoints, int k) {
    

        //this like probability

        int e = cardPoints.length - 1;
        int sum = 0;

        for(int i = 0; i < k; i++){
            sum += cardPoints[i];
        }

        int max = sum;

        for(int i = k - 1; i >= 0; i--){
            sum -= cardPoints[i];
            sum += cardPoints[e];
            e--;

            max = Math.max(max,sum);
        }

        return max;

        
    }
}