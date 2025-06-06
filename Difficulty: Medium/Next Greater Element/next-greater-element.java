class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> l =  new ArrayList<>();
        
        for(int i = 0; i < arr.length - 1; i++){
            int max = arr[i];
            boolean isthere = false;
            for(int j = i + 1; j < arr.length; j++){
                
                if(arr[j] > max){
                    max = arr[j];
                    isthere = true;
                    break;
                }
                
            }
            if(isthere == false){
                l.add(-1);
            }
            else{
                l.add(max);
            }
            
        }
        l.add(-1);
        return l;
    }
}