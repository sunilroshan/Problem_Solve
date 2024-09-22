class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {

      //  List<String> list = new ArrayList<>();  // failing for large test cases O(N*M)

      Set<String>list = new HashSet<>();

        for(String s : bannedWords){
            list.add(s);
        }

        int count = 0;

        for(int i = 0; i < message.length; i++){

            if(list.contains(message[i])){

                count++;

            }
        }

        if(count >= 2){
            return true;
        }
        
            return false;
        
        
    }
}