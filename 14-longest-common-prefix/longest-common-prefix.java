class Solution {
    public String longestCommonPrefix(String[] strs) {

        //when come to prefix suffic use pattern as "sorting"

        StringBuilder sb = new StringBuilder();

        Arrays.sort(strs);

        char arr1[] = strs[0].toCharArray();
        char arr2[] = strs[strs.length-1].toCharArray();

        for(int i=0; i<arr1.length; i++){

            if(arr1[i] == arr2[i]){
                sb.append(arr1[i]);
            }
            else{
                break;
            }

        }

        return sb.toString();
        
    }
}