package lesMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	
	public static void main(String[] args) throws Exception
	    {
	        readText();
	        rectangle(0,0);
	    }
	 
	    public static void readText() throws IOException {
	        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	        int m = Integer.parseInt(read.readLine());
	        int n = Integer.parseInt(read.readLine());
	    }
	 
	    public static void rectangle(int m, int n){
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print(8);
	            }
	            System.out.println();
	        }
	    }
}
