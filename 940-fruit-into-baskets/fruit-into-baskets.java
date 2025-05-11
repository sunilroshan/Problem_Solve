class Solution {
    public int totalFruit(int[] fruits) {

        //the objective of this question is find the maxlength of the subarray with atmost two types of numbers

        //here is the brute force approach
        int maxlen = -1;

        // for(int i = 0; i < fruits.length; i++){
        //  HashSet<Integer> s = new HashSet<>();

        //     for(int j = i; j < fruits.length; j++){

        //         s.add(fruits[j]);
        //         if(s.size() <= 2){
        //             maxlen = Math.max(maxlen,j - i + 1);
        //         }
        //         else{
        //             break;
        //         }
                
        //     }
        // }


        //actual they are optimizing the code by the data structure

        int l = 0;
        int r = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        while(r < fruits.length){
            map.put(fruits[r],map.getOrDefault(fruits[r] , 0) + 1);

            while(map.size() > 2){
                map.put(fruits[l],map.get(fruits[l]) - 1);

                if(map.get(fruits[l]) == 0){
                    map.remove(fruits[l]);
                }

                l++;

            }

            if(map.size() <= 2){
                maxlen = Math.max(maxlen,r - l + 1);
                r++;
            }


        }
        

        return maxlen;
        
    }
}