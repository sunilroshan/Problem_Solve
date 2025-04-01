//{ Driver Code Starts
import java.lang.Math;
import java.util.Scanner;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new Solution().convertfive(N));
            T--;
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


class Solution {
    int convertfive(int num) {
        // Your code here
        
        if(num == 0){
            return 5;
        }
        
        int ans = 0;
        int fact = 1; //it is in ones place
        
        while(num > 0){
            
            int rem = num % 10;
            
            if(rem != 0){
                
                ans += rem*fact; 
            }
            else{
                ans += 5 * fact;
            }
            
            fact = fact * 10;
            num = num / 10;
        }
        
        return ans;
    }
}