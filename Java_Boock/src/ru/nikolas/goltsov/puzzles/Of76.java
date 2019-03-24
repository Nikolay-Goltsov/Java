/**
 * 
 */
package ru.nikolas.goltsov.puzzles;

/**
 * @author Hakers
 *
 */
interface Nose {
	public int iMethod();

}

abstract class Picasso implements Nose {

	public int iMethod() {
		return 7;

	}
}

class Acts extends Picasso {
	public int iMethod() {
		return 5;

	}
}

class Clowns extends Picasso {

}

public class Of76 extends Clowns {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Nose[] i = new Nose[3];

		i[0] = new Acts();
		i[1] = new Clowns();
		i[2] = new Of76();

		for (int x = 0; x < 3; x++) {
			System.out.println(i[x].iMethod() + " " + i[x].getClass());
		}

	}

}
