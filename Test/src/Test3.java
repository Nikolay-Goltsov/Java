import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test3 {

	public static void main(String[] args) throws IOException {

//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		String name1 = reader.readLine();
//		String name2 = reader.readLine();
//		String name3 = reader.readLine();
//
//		System.out.print(name1 + " + " + name2 + " + " + name3 + " = " + " Чистая любовь, да-да!");
//		
	
		  String strn;  
          int flag=0;  
          System.out.println("Enter the string:");  
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
          strn=br.readLine();  
          System.out.println("Result string is:");  
          //write your logic here  
          
          
 
 
          //end  
          if(flag==1)  
              System.out.print("palindrome");  
          else   
              System.out.print("not a palindrome2");  
              
	}
}
