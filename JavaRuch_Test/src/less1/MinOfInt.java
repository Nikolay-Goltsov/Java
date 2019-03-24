package less1;



public class MinOfInt {
	public static double x;
	public static double y;
	public static double z;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("Minimum value = "+minInt(12, 23));
//		System.out.println("Maximum value = " + maxInt(12, 23));
//		minIntTree(-1, 120, 112);
//		minQudro(11.0, -22.5, 55.8, 88.8);
//		System.out.println("Minimun value = " + x);
		nameS("Hi");

	}
	
	public static void nameS(String s) {
		
		for (int i = 0; i < 3; i++) {
			
			System.out.print(s);
			System.out.print(" ");
		}
		
	}

	public static int maxInt(int a, int b) {

		return Math.max(a, b);

	}

	public static void minIntTree(int a, int b, int c) {

		if (a < b) {
			x = a;
		} else {
			x = b;
		}
		if (b < c) {
			x = b;

		} else {
			x = c;
		}
		if (a < c) {
			x = a;
		} else {
			x = c;
		}

	}

	public static void minQudro(double a, double b, double c, double d) {

		if (a < b) {
			x = a;
		} else {
			x = b;
		}
		if (c < d) {
			y = c;
		} else {
			y = d;
		}
		if (x < y) {
			z = x;
		} else {
			z = y;
		}
		System.out.println("Minimun value = " + z);
	}

}
