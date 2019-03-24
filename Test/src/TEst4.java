import java.util.Scanner;

public class TEst4 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Угадай число");
        int range = 1000;
        int number = (int) (Math.random() * range);
        playLevel (range, number);
        scanner.close();
        
     
	}
	   private static void playLevel(int range, int number) {
           while(true){
               System.out.println("Угадай от нуля до " + range);
               int input_number = scanner.nextInt();
               if(input_number == number){
                   System.out.println("Вы угадали");
                   break;
               } else if (input_number > number){
                   System.out.println("Меньше");
               }else {
                   System.out.println("Больше");
               }

           }
       }
}
