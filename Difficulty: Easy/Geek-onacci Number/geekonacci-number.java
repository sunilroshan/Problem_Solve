/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		for(int i = 0; i < n; i++){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int N = sc.nextInt();
		    
		int sum = 0;
		int count = 3;
		
		while(count != N){
		    
		    sum = a + b + c;
		    
		    a = b;
		    b = c;
		    c = sum;
		    count++;
		    
		}
		
		System.out.println(sum);
		}
		
		
	}
}