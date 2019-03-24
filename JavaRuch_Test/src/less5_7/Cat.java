package less5_7;

public class Cat {

	String name;
	int age;
	int weight;
	String color;
	String address;

	public void initialize(String name) {
		this.name=name;
	}

	public void initialize(String name,int weidht,int age) {
		this.name=name;
		this.weight=weidht;
		this.age=age;
	}

	public void initialize(String name, int age) {
//		int weight = 5;
		this.weight=5;
		this.name=name;
		this.age=age;
	}
	public void initialize(int weight, String color) {
		this.name=null;
		this.address=null;
		int age = 0;
		System.out.println("Найден ,бездомный кот. Адрес: "+ address+  " Имя: "+ name+" Цвет: "+ color);		
	}
	public void initialize(int weight,String color, String address) {
		this.name=null;
		this.weight=weight;
		this.color=color;
		this.address=address;
		System.out.println("Найден домашний кот из "+ address+ " вес "+ weight);
	}
	
	
}
