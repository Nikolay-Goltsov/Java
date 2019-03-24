
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 99;
		String s = "бутылок (бутылки) ";

		while (x > 0) {
			if (x == 1) {
				s = "бутылка";
			}
			System.out.println(x + " " + s + " пива на стене");
			System.out.println(x + " " + s + " пива");
			System.out.println("Возьми одну.");
			System.out.println("Пусти по кругу.");
			x = x - 1;
			
		
			} // while
		if (x>0) {
			System.out.println(x + " " + s + " Пива на стене");
		} else {
			System.out.println("Нет пива на стене");
		} // else
		}// main
}// class
