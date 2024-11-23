class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int n = nums.length;

        

        int p1 = 0;
        int c1 = 0;

        int p2 = 0;
        int c2 = 0;

        for(int i : nums){

            if(i == p1){
                c1++;
            }
            else if(i == p2){
                c2++;
            }
            else if(c1 == 0){
                p1 = i;
                c1++;
            }
            else if(c2 == 0){
                p2 = i;
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }

        c1 = 0;
        c2 = 0;

        for(int i : nums){
            if(i == p1){
                c1++;
            }
            else if(i == p2){
                c2++;
            }
        }

        List<Integer> res = new ArrayList<>();

        if(c1 > (n/3)){
            res.add(p1);
        }
        if(c2 > (n/3)){
            res.add(p2);
        }
        // else{
        //     res.add()
        // }

        return res;
        
    }
}