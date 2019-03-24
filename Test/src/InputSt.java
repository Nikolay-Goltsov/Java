import java.util.Scanner;


//Ввести с клавиатуры число и имя, вывести на экран строку:
//"имя" захватит мир через "число" лет. Му-ха-ха!
// Вывод Вася захватит мир через 8 лет. Му-ха-ха!
public class InputSt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String age = scanner.nextLine();
		String name = scanner.nextLine();


		
		System.out.println(name+" захватит мир через "+age+" лет. Му-ха-ха!");
	}

}
