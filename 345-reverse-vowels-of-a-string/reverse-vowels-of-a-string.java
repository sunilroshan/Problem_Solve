class Solution {
    public String reverseVowels(String s) {

        int n = s.length();
        int st = 0;
        int en = n-1;

        //this is the main part of this problem

        String vow = "aeiouAEIOU";

        char arr[] = s.toCharArray();

        while (st < en){

            while(st < en && vow.indexOf(arr[st]) == -1){
                st++;
            }
            while(st < en && vow.indexOf(arr[en]) == -1){
                en--;
            }

            char temp = arr[st];
            arr[st] = arr[en];
            arr[en] = temp;

            st++;
            en--;

        }

        //converting char array to string
        String ans = new String(arr);

        return ans;
        
    }
}