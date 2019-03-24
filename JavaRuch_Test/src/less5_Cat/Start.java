package less5_Cat;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat cat = new Cat("Nusha", 3, 5, 10);
		Cat cat2 = new Cat("Dun'asha", 3, 5, 20);
		System.out.println(cat.fight(cat2));
		System.out.println(cat2.fight(cat));
	}

	public static class Cat {
		protected String name;
		protected int age;
		protected int weight;
		protected int strength;

		public Cat(String name, int age, int weight, int strength) {

			this.name = name;
			this.age = age;
			this.weight = weight;
			this.strength = strength;
		}
		public boolean fight(Cat anotherCat) {
			int agePlus = this.age > anotherCat.age ? 1 : 0;
//			System.out.println("agePlus " + agePlus);
			int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
//			System.out.println("weightPlus " + weightPlus);
			int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;
//			System.out.println("strengthPlus " + strengthPlus);

			int score = agePlus + weightPlus + strengthPlus;
			System.out.println(score);
			return score > 2; 
//			 return score > 2 ? true : false;

		}
	}

}
