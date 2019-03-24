/**
 * 
 */

/**
 * @author Hakers
 *
 */
public class GC {

	/**
	 * @param args
	 */
	public static GC doStuff() {
		GC newGC = new GC();
		doStuff2(newGC);
		return newGC;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GC gc1;
		GC gc2 = new GC();
		GC gc3 = new GC();
		GC gc4 = gc3;
		gc1 = doStuff();

		gc2 = null;
		gc1 = null;
		gc1 = gc4;
		if (gc1 == null) {
			System.err.println("gc1 del");
		} else {
			System.out.println("gc1 OK!");
		}
		if (gc2 == null) {
			System.err.println("gc2 del");
		} else {
			System.out.println("gc2 OK!");
		}
		if (gc3 == null) {
			System.err.println("gc3 del");
		} else {
			System.out.println("gc3 OK!");
		}
		if (gc4 == null) {
			System.err.println("gc4 del");
		} else {
			System.out.println("gc4 OK!");
		}
		

		
	}

	public static void doStuff2(GC copyGC) {
		// TODO Auto-generated method stub
		GC localGC;

	}
}
