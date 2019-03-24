import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Еуые_5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		  checkSeason(12);
//	        checkSeason(4);
//	        checkSeason(7);
//	        checkSeason(10);
//	       Red red1 = new Red();
//	       red1.Red();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String num = reader.readLine();
		double num_2 = Double.parseDouble(num);

		while (num_2 >= 5) {
			num_2 = num_2 - 5;
			if (num_2 >= 0 & 3 > num_2) {
				System.out.println("Yollow");
				
			} else if (num_2 >= 3 & 4 > num_2) {
				System.out.println("Red");
			} else if (num_2 >= 4 & 5 > num_2) {
				System.out.println("Gren");
			}
		}

	}
//public static class  Red {
//	public void Red(){
//		System.out.println("Red");
//	}

}
