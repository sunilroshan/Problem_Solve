class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {

        HashMap<Integer,Integer> map = new HashMap<>();

        int n1 = nums.length;

        int count = 0;

        for(int i=0; i<n1; i++){
          if(nums[i] == x){
            count++;
            map.put(count,i);

          }

        }

        for(int i=0; i<queries.length; i++){
            if(map.containsKey(queries[i])){
                queries[i] = map.get(queries[i]);
            }
            else{
                queries[i] = -1;
            }
        }

        return queries;
    }
}