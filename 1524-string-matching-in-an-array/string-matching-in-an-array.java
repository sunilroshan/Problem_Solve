class Solution {
    public List<String> stringMatching(String[] words) {

        int n = words.length;

        Arrays.sort(words,(a,b)->Integer.compare(a.length(),b.length()));

        List<String> ans = new ArrayList<>();

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){

                if(words[j].contains(words[i])){
                    ans.add(words[i]);
                    break;
                }
            }
        }

        return ans;

        
    }
}