class Solution {
    public int lastStoneWeight(int[] stones) {

        //data structure use is max heap
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b) -> b - a);

        for(int i = 0; i < stones.length; i++){
            q.add(stones[i]);
        } 

        while(q.size() > 1){

            int x = q.poll();
            int y = q.poll();

            if(x != y){
                int w = Math.abs(y - x);
                q.add(w);
            }
        }

        if(!q.isEmpty()){
            return q.poll();
        }else{
            return 0;
        }

    }
}