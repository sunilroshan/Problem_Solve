class Solution {
    public String frequencySort(String s) {

        Map<Character,Integer> map = new HashMap<>();

        for(char i : s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        //sorting in descending oreder so using priority queue

        PriorityQueue<Character> q = new PriorityQueue<>((a,b) ->(map.get(b) - map.get(a))); // it is sorting based on the values

        for(char i : map.keySet()){
            q.add(i);
        }

        StringBuilder sb = new StringBuilder();

        while(!q.isEmpty()){

            char c = q.poll();

            for(int i = 1; i <= map.get(c); i++){
                sb.append(c);
            }

        }

        return sb.toString();
        
    }
}