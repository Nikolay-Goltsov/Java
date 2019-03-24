import java.util.Scanner;

/*

Ввести с клавиатуры отдельно Имя, число1, число2.
Вывести надпись:
"Имя" получает "число1" через "число2" лет.

Пример: Коля получает 3000 через 5 лет.

вводимые данные: Коля 3000 5




*/
public class InputSt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.nextLine();
//		int mane = scanner.nextInt();
//		int age = scanner.nextInt();
//		
//		System.out.println(name+" получает "+mane+" через " + age+" лет.");
		System.out.println(name+" зарабатывает $5,000. Ха-ха-ха!");
	}

}
