class Solution {
    public boolean check(int[] nums) {

       ArrayList<Integer> original = new ArrayList<>();
        ArrayList<Integer> l = new ArrayList<>();

        for(int i : nums){
            
            original.add(i);
        }
        for(int i : nums){
            
            l.add(i);
        }

        Collections.sort(l);

        // boolean found = false;


        for(int i = 0; i <= l.size(); i++){

            Collections.rotate(l,i);

            if(equal(l,original)){
                // found = true;
                return true;
            }

            Collections.sort(l);
        }

      return false;
        
    }

    public static boolean equal(ArrayList<Integer> l,ArrayList<Integer> original){
        
        if(original.equals(l)){
            return true;
        }
        else{
            return false;
        }
    }
}