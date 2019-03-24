package ru.GameLauncher;

public class Player {
	int number =0;// Здесь храниться вариант числа

	public void guess() {
		number = (int) (Math.random() * 100);
		System.out.println("Думаю что это число " + number);
	}
}
