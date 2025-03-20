class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        permu(ans,temp,nums);
        return ans;
        
    }

    public void permu(List<List<Integer>> result,List<Integer> temp,int nums[]){

        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp)); // Store a copy of the permutation
            return;
        }

        for (int i = 0; i <= temp.size(); i++) {
            List<Integer> newTemp = new ArrayList<>(temp); // Create a new list for each insertion
            newTemp.add(i, nums[temp.size()]); // Insert element at different positions
            permu(result, newTemp, nums);
        }
    }
}