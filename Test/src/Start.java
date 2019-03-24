
public class Start {
	/*
	 * Требования:
	 * 
	 * Программа должна выводить текст на экран. Метод main не должен вызывать
	 * функцию System.out.println или System.out.print. Метод print3 должен выводить
	 * текст на экран. Метод main должен вызвать метод print3 ровно два раза. Метод
	 * print3 должен выводить переданную строку (слово) на экран три раза, но в
	 * одной строке.
	 */
	public static void print3(String s) {
		// напишите тут ваш код
		System.out.print(s + " ");
		System.out.print(s + " ");
		System.out.print(s + " ");
		System.out.println();
	}

	public static long getVolume(int a, int b, int c) {

		long x = (a * b * c) * 1000;
		return x;
		// напишите тут ваш код
	}
	public static void writeToConsole(String s) {
		// напишите тут ваш код
		 s = "printing: " +s; 
		System.out.println(s);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		writeToConsole("Hello world!");
		
		// System.out.println(getVolume(25, 5, 2));

//		 String s = "Ho-ho-ho!";
//
//		 printTextMoreTimes(s, 10);
//	     System.out.println(sqr(5));
//	     sum(2, 2);      

//		  print("Java easy to learn!");
//        print("Java opens many opportunities!");
//        hackSalary(700);
//		  printCircleLength(5);
//		int a = 5;
//		int b = 7;
//		System.out.println(a+b);
//		System.out.println(a*b);

//		System.out.println(convertCelsiumToFahrenheit(41));

//		 	Man man = new Man();
//		    Woman woman = new Woman();
//		    man.wife=woman;
//		    woman.husband=man;

//		Cat cat = new Cat();
//		Dog dog = new Dog();
//		Fish fish = new Fish();
//		Woman woman = new Woman();
//		cat.owner=woman;
//		dog.owner=woman;
//		fish.owner=woman;

//		System.out.println(getWeight(888));

//			print3("window");
//	        print3("file");

//		int a = 1;
//        int b = 2;
//
//        System.out.println("a + b = " + (a + b));
//        sum(a, b);
//        System.out.println("a + b = " + (a + b));
//		
//		 Cat cat = new Cat();
//
//	        System.out.println(cat.name);
////	        changeName(cat);
//	        System.out.println(cat.name);
//	        
//	        printString("Hello, Amigo!");

//		Cat cat = new Cat();
//		int a = 5;
//		String text = a + "Cat is " + cat + a;
//		//String text2 = cat + a + "Cat is " + cat + a;// так складывать нельзя
//		System.out.println(text);

	}

	private static void printString(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);
	}

//	   public static String changeName(Cat cat) {
//	        cat.name = "Jerry";
//	    }

	public static class Cat {
		String name = "Tom";
	}

//    public static void changeName(Cat cat) {
//        cat.name = "Jerry";
//    }
//
//    public static class Cat {
//        String name = "Tom";
//    }
//	

	public static void sum(int a, int b) {
		a = 5;
		b = 10;
		int sum = a + b;
	}

	public static void printTextMoreTimes(String s, int count)

	{

		for (int i = 0; i < count; i++)

		{
			System.out.println(s);
		}
	}

	public static int sqr(int a) {
		return a * a;
	}

//	public static void sum(int a, int b) {
//		int c = a + b;
//		System.out.print(c);
//	}

	public static void print(String s) {
		// напишите тут ваш код

		System.out.println(s);
		System.out.println(s);
		System.out.println(s);
		System.out.println(s);
	}

	public static void hackSalary(int a) {
		// напишите тут ваш код
		a = a + 100;
		System.out.println("Твоя зарплата составляет: " + a + " долларов в месяц");
	}

	public static void printCircleLength(int radius) {
		// напишите тут ваш код
		double L = 2 * 3.14 * radius;
		System.out.println(L);
	}

	public static double convertCelsiumToFahrenheit(int celsium) {
		// напишите тут ваш код
		double f = 9.0 * celsium / 5 + 32;

		return f;
	}

	public static class Man {
		public int age;
		public int height;
		public Woman wife;
	}

//	public static class Cat {
//		public Woman owner;
//	}

	public static class Dog {
		public Woman owner;
	}

	public static class Fish {
		public Woman owner;
	}

	public static class Woman {

		public int age;
		public int height;
		public Man husband;
	}

	public static double getWeight(int earthWeight) {

		double lune = (earthWeight * 1.17) - earthWeight;
		return lune;
		// напишите тут ваш код
	}
	

}
