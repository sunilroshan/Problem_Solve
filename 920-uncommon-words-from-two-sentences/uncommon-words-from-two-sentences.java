class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

      Map<String,Integer> map = new HashMap<>();

       String w1[] = s1.split(" ");
       String w2[] = s2.split(" ");

       for(String w : w1){
        map.put(w,map.getOrDefault(w,0)+1);
       }
       for(String w : w2){
        map.put(w,map.getOrDefault(w,0)+1);
       }

      List<String> ans = new ArrayList<>();

       for(Map.Entry<String,Integer> entry : map.entrySet()){

           if(entry.getValue() == 1){

              ans.add(entry.getKey());
             
           }
       }
       String out[] = ans.toArray(new String[0]);

       return out;


    }
}