class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {

       //here queries is a 2D matrix
       int ans[] = new int[queries.length];

    //    if(arr.length == 1){
    //     return arr;
    //    }


       for(int i=0; i<queries.length; i++){ // length of the queries
            
            int st = queries[i][0];
            int end = queries[i][1];
            int xor = 0;

            for(int j=st; j<=end; j++){
                   
               xor ^= arr[j];
            }

            ans[i] = xor;
       }

       return ans;
    }
}