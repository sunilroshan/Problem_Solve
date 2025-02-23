class Solution {
    public int[][] merge(int[][] intervals) {

        //first sort the intervals based on the starting
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        int ind = 0;
        int n = intervals.length;

        ArrayList<int []> l = new ArrayList<>();

        while(ind < n){

            int starting = intervals[ind][0];
            int currend = intervals[ind][1];

            while(ind < n - 1 && currend >= intervals[ind + 1][0]){
                
                currend = Math.max(currend,intervals[ind + 1][1]);
                ind++;
            }

            l.add(new int[]{starting,currend});
            ind++;

        }

        int res[][] = new int[l.size()][2];

        int i = 0;

        for(int arr[] : l){
             res[i++] = arr;
        }

        return res;
        
    }
}