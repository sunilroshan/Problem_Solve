class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

       

        int n = heights.length;

        // for(int i=0; i<n-1; i++){
        //     for(int j=i+1; j<n; j++){

        //     if(heights[i] < heights[j]){
        //         String temp = names[i];
        //         names[i] = names[j];
        //         names[j] = temp;
                
        //         int temp1 = heights[i];
        //         heights[i] = heights[j];
        //         heights[j] = temp1;
        //     }

        //     }

        // }

        // return names;

        //here i am going to reduce the runtime by using TreeMap

        TreeMap<Integer,String> map = new TreeMap<>();

          
          for(int i = 0; i < n; i++){
            map.put(heights[i],names[i]);
          }

          //after this the element is sorted...

          String arr[] = new String[n];

          int in = arr.length - 1;

          for(int i : map.keySet()){

            String s = map.get(i);
            arr[in] = s;
            in--;
          }

          return arr;
        
    }
}