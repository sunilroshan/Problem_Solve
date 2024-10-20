class Solution {
    public int beautySum(String s) {
        int n = s.length();

        int sum = 0;

        for(int i = 0; i < n; i++){
            int[] freq_arr = new int[26];
            for(int j = i; j < n; j++){
                freq_arr[s.charAt(j) - 'a']++;

                int maxm = getMax(freq_arr);
                int minm = getMin(freq_arr);
                sum += maxm - minm;
            }
        }

        return sum;
        
    }

    public static int getMax(int freq_arr[]){

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < freq_arr.length; i++){
            max = Math.max(freq_arr[i],max);
        }
        return max;
    }
    public static int getMin(int freq_arr[]){

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < freq_arr.length; i++){

            if(freq_arr[i] != 0){
            min = Math.min(freq_arr[i],min);
            }
        }
        return min;
    }
}