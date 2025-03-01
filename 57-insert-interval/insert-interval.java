class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
         ArrayList<int[]> l = new ArrayList<>();

         int curr = 0;

         while(curr < intervals.length && intervals[curr][1] < newInterval[0]){//start time of target is greater than the current ending
            l.add(intervals[curr]);
            curr++;
         }


         while(curr < intervals.length && intervals[curr][0] <= newInterval[1]){  //ending of target is greater than the current starting
            newInterval[0] = Math.min(intervals[curr][0],newInterval[0]);
            newInterval[1] = Math.max(intervals[curr][1],newInterval[1]);
            curr++;
         }

         l.add(newInterval);

          while(curr < intervals.length && intervals[curr][0] > newInterval[1]){//ending time of target is greater than the current starting
            l.add(intervals[curr]);
            curr++;
         }

         int[][] ans = new int[l.size()][2];
         int i = 0;

         for(int arr[] : l){
            ans[i] = arr;
            i++;
         }

         return ans;
    }
}