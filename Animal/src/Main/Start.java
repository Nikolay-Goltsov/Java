/**
 * 
 */
package Main;

import ru.nikolas.goltsov.canine.Dog;
import ru.nikolas.goltsov.canine.WildDog;
import ru.nikolas.goltsov.feline.Cat;

/**
 * @author Hakers
 *
 */
public class Start {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d = new Dog();
		d.barking();
		WildDog wd = new WildDog();
		wd.barking();
		Cat c = new Cat();
		c.barking();

	}

}
