/**
 * 
 */
package ru.home.nikolai_goltsov;

import java.awt.Point;
import java.util.ArrayList;

/**
 * @author Hakers
 *
 */
public class Program_ArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> people = new ArrayList<String>(13);
		// добавим в список ряд элементов
		people.add("Tom");
		people.add("Alice");
		people.add("Kate");
		people.add("Sam");
		people.add(1, "Bob"); // добавляем элемент по индексу 1
		people.add("Malisch");
		people.add("");
		people.add("");
		people.add("");
		people.add("fdfdf");
		people.add("");
		people.add("sfcsc");

		System.out.println(people.get(11));// получаем 2-й объект
//		people.set(1, "Robert"); // установка нового значения для 2-го объекта
//
		System.out.printf("ArrayList has %d elements \n", people.size());// получение объема коллекции
//
//		for (String person : people) {
//
//			System.out.println(person);
//		}
//		// проверяем наличие элемента
//		if (people.contains("Tom")) {
//
//			System.out.println("ArrayList contains Tom");
//		} else {
//			System.out.println("ArrayList no contains");
//		}
//		// удалим несколько объектов
//		// удаление конкретного элемента
//		people.remove("Robert");
//		
//		// удаление по индексу
//		people.remove(0);
//
//		Object[] peopleArray = people.toArray();
//		for (Object person : peopleArray) {
//
//			System.out.println(person);
//		}
//		System.out.printf("ArrayList has %d elements \n", people.size());
//		
//		people.clear();
//		
//		System.out.printf("ArrayList has %d elements \n", people.size());
	}

}
