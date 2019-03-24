
public class toString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Duck duck1 = new Duck();

		System.out.println(duck1);
		System.out.println(duck1.toString());
		duck1.toString();
	}

	public static class Duck {
		public String toString() {
			return "Duck";
		}

	}

}
