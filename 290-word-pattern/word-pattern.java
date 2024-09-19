class Solution {
    public boolean wordPattern(String pattern, String s) {
        
       String[] arr = s.split(" ");  // splitting the string to string array

      if(pattern.length()!= arr.length) return false;

      HashMap<Character,String> hm = new HashMap<Character,String>(); 

      for(int i=0;i<pattern.length();i++){
          char ch = pattern.charAt(i);
          
          boolean containsKey = hm.containsKey(ch);

          if(hm.containsValue(arr[i]) &&  !containsKey) return false;  //it comes exists wwhen (true && true)

          if(containsKey && !hm.get(ch).equals(arr[i])) return false;

          else {
              hm.put(ch,arr[i]);
          }
      }
      return true;
    }
}