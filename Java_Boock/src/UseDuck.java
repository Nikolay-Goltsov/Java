/**
 * 
 */

/**
 * @author Hakers
 *
 */
class Animal{
	public Animal() {
		// TODO Auto-generated constructor stub
		System.out.println("Animal Go");
	}
}
class Duck extends Animal{
	int size;
	
	public Duck() {
		System.out.println("Go Duck");
		size =27;
	}
	public Duck(int Size) {
		System.out.println("Go Size");
		size=Size;
	}
}
public class UseDuck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Duck d = new Duck();
		System.out.println("Size = "+d.size);
		Duck d1= new Duck(0);
		System.out.println("Size = "+d1.size);
	}

}
