class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // int num[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103}; //prime numbers

        // Map<Long,List<String>> map = new HashMap<>();
        // for(String word : strs){
        //     long pro = 1L; //taking product, here using long for larger data
           
        //     for(int i=0; i<word.length(); i++){
        //         pro *= num[word.charAt(i) - 'a'];  // it will the position in the 26 character
        //     }

        //     if(map.containsKey(pro)){
        //         map.get(pro).add(word);
        //     }
        //     else{
        //         map.put(pro,new ArrayList<String>());
        //         map.get(pro).add(word);
        //     }
        // }

        // List<List<String>> ans = new ArrayList<List<String>>();

        // for(List<String> val : map.values()){
        //     ans.add(val);
        // }    

        // return ans; 

        Map<String,List<String>> map = new HashMap<>();

        for(String str : strs){
            String word = str;
            char arr[] = word.toCharArray();
            
            Arrays.sort(arr);

            String name = new String(arr);

            if(map.containsKey(name)){
                map.get(name).add(word);
            }
            else{
                map.put(name, new ArrayList<String>());
                map.get(name).add(word);
            }
        }   

        List<List<String>> ans = new ArrayList<List<String>>();

        for(List<String> val : map.values()){
            ans.add(val);
        }    

        return ans; 

        
        
    }
}