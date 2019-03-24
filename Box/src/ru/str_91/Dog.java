package ru.str_91;
/**
 * 
 */

/**
 * @author Hakers
 *
 */


public class Dog {

	/**
	 * @param args
	 */
	String name;
	public static void main(String[] args) {

//		Создаем объект Dog и получаем к нему доступ
		Dog dog1 = new Dog();
		dog1.name = "Bart";
		dog1.bark();
		
//		Теперь создадим массив типа Dog
		Dog[] mayDog = new Dog[3];
//		и поместим в него несколько элементов
		mayDog[0] = new Dog();
		mayDog[1] = new Dog();
		mayDog[2] = dog1;
//		Теперь получим доступ к объектам Dog
//		с помощью ссылок из массива
		mayDog[0].name = "Fred";
		mayDog[1].name = "George";
//		Какое имя у последней собаки?
		System.out.print("name Dog - ");
		System.out.println(mayDog[2].name);
//		переберем все элементы массива 
//		и вызовем для каждого метод bark()
		int x = 0;
		while (x < mayDog.length) {
			mayDog[x].bark();
			x++;

		}

	}
	public   void bark() {
		// TODO Auto-generated method stub
		System.out.println(name + " Gav Gav");
	}

	public void eat() {

	}

	public void chaseCat() {

	}
}
