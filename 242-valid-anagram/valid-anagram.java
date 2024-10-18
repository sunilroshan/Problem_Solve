class Solution {
    public boolean isAnagram(String s, String t) {
        
        // char[] arr1 = s.toCharArray();
        // char[] arr2 = t.toCharArray();

        // Arrays.sort(arr1);
        // Arrays.sort(arr2);

        // return Arrays.equals(arr1,arr2); // it returns as false or true

        //efficient approach

        //O(n)

        if(s.length() != t.length()){
            return false;
        }

        int arr[] = new int[26];

        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                return false;
            }
        }

        return true;        
    }
}