/**
 * 
 */
package ru.home.nikolai_goltsov;

import java.util.ArrayDeque;

/**
 * @author Hakers
 *
 */
public class Program_ArrayDeque_Collection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayDeque<String> states = new ArrayDeque<String>();// по дефолту емкость 16
		// стандартное добавление элементов
		states.add("Germany");
		states.addFirst("France"); // добавляем элемент в самое начало
		states.push("Great Britain"); // добавляем элемент в самое начало
		states.addLast("Spain"); // добавляем элемент в конец коллекции
		states.add("Italy");

		// получаем первый элемент без удаления
		String sFirst = states.getFirst();
		System.out.println(sFirst); // Great Britain
		// получаем последний элемент без удаления
		String sLast = states.getLast();
		System.out.println(sLast); // Italy

		System.out.printf("Queue size: %d \n", states.size()); // 5

		// перебор коллекции
		while (states.peek() != null) {
			// извлечение c начала
			System.out.println(states.pop());
		}

		// очередь из объектов Person
		ArrayDeque<Person> people = new ArrayDeque<Person>();
		people.addFirst(new Person("Tom"));
		people.addLast(new Person("Nick"));
		// перебор без извлечения
		for (Person p : people) {

			System.out.println(p.getName());
		}

	}

}

class Person {

	private String name;

	public Person(String value) {

		name = value;
	}

	String getName() {
		return name;
	}
}