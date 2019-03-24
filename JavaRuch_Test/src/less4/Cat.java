package less4;

public class Cat {
	private String name;
	private static int catsCount = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat cat = new Cat();
//		cat.setName("Waska");
//		cat.addNewCat();
//		cat.addNewCat();
//		cat.addNewCat();
		cat.setCatsCount(20);
		System.out.println(catsCount);
	}

//	public void setName(String name) {
//		// написать тут ваш код
//		this.name = name;
//
//		System.out.println(name);
//	}

	/*
	 * Реализовать метод addNewCat, чтобы при его вызове (т.е. добавлении нового
	 * кота), количество котов увеличивалось на 1. За количество котов отвечает
	 * переменная catsCount.
	 */
//	public static void addNewCat() {
//		// написать тут ваш код
//
//		catsCount++;
//	}

	/*
	 * Реализовать метод setCatsCount так, чтобы с его помощью можно было
	 * устанавливать значение переменной catsCount равное переданному параметру.
	 */
	public static void setCatsCount(int catsCount) {

		// написать тут ваш код
		Cat.catsCount = catsCount;

	}
}
