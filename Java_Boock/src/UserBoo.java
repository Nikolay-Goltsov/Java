/**
 * 
 */

/**
 * @author Hakers
 *
 */
class Boo {
	public Boo(int i) {
		System.out.println("Boo.Boo(i)");
	}

	public Boo(String s) {
		System.out.println("Boo.Boo(s)");
	}

	public Boo(String s, int i) {
		System.out.println("Boo.Boo(s,i)");
	}
}

class SonOfBoo extends Boo {

	public SonOfBoo() {
		super("boo");
		System.out.println(1);
	}

	public SonOfBoo(int i) {
		super("Feed");
		System.out.println(2);
	}

	public SonOfBoo(String s) {
		super(42);
		System.out.println(3);
	}
//	Данный конструктор не допустим т.к. нет вызова конструктора родительского класса.
//	public SonOfBoo (int i, String s) {
//		
//	}
//	Данный конструктор недопустим т.к. в родительском классе отсутсвует конструктор с такими параметрами
//	public SonOfBoo(String a, String b, String c) {
//		super (a,b);
//	}
	
	
}

public class UserBoo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SonOfBoo s = new SonOfBoo();
		SonOfBoo s1 = new SonOfBoo(1);
		SonOfBoo s3 = new SonOfBoo("name");
		
	}

}
