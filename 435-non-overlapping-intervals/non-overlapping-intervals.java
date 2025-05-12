class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        //this question is same as the N meetings in one room 
        //the concept is that "maximum no of mettings in room"
        //it only can be achieved by minimum staring and ending time..that is(the meeting ending fastly so that there is more no of meeting)

        Arrays.sort(intervals,(a,b) -> a[1] - b[1]); //so we are sorting by ending

        int meetingend = intervals[0][1];
        int ct = 1;

        //initially one meeting can be done wright

        for(int i = 1; i < intervals.length; i++){

            if(meetingend <= intervals[i][0]){
                ct++;
            meetingend = intervals[i][1];
            }

        }

       
        return intervals.length - ct;
        
    }
}