//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class CountSort
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            String arr = "";
            arr = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.countSort(arr));
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


class Solution
{
    //Function to arrange all letters of a string in lexicographical 
    //order using Counting Sort.
    public static String countSort(String arr)
    {
        
        
        int freq[] = new int[26];
        
        for(int i = 0; i < arr.length(); i++){
            freq[arr.charAt(i) - 'a']++;   //here character is converted to int so 97 - 97 = 0 
        }
        
        String ans = "";
        
        
        for(int i = 0; i < 26; i++){
            if(freq[i] != 0){
                int count = freq[i];
                
                for(int j = 0; j < count; j++){
                    ans += (char)(i + 'a');
                }
            }
        }
        
        return ans;
    }
}