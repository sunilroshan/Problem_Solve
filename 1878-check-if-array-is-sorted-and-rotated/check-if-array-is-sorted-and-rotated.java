// class Solution {
//     public boolean check(int[] nums) {

//        ArrayList<Integer> original = new ArrayList<>();
//        ArrayList<Integer> l = new ArrayList<>();

//         for(int i : nums){
            
//             original.add(i);
//         }
//         for(int i : nums){
            
//             l.add(i);
//         }

//         Collections.sort(l);

//         for(int i = 0; i <= l.size(); i++){

//             Collections.rotate(l,i);

//             if(equal(l,original)){
              
//                 return true;
//             }

//             Collections.sort(l);
//         }

//       return false;
        
//     }

//     public static boolean equal(ArrayList<Integer> l,ArrayList<Integer> original){
        
//         if(original.equals(l)){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
// }


class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        // In a perfectly sorted array, no inversions exist.
        // In a sorted but rotated array, exactly one inversion exists.
        
        // Loop through array and check for inversions
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            // More than 1 inversion means it's not sorted and rotated
            if (count > 1) return false; 
        }
        
        return true;

        // Why is (i + 1) % n used?
// \U0001f449 Because the array is circular, we check nums[n-1] with nums[0] in the last iteration.
    }
}
