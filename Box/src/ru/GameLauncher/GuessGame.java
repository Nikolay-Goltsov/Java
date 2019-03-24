package ru.GameLauncher;

public class GuessGame {
//	Создаем три переменных экземпляра для трех объектов Player.
	Player p1;
	Player p2;
	Player p3;

	public void startGame() {
//		Создаем три объекта Player и присваеваем их трем переменным экземпляра.
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
//		Объявляем три переменных для хранения вариантов для каждого игрока
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
//		Объявляем три перемееных для проверки правельности ввода для каждого игрока
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;

//		Создаем число которое игроки должны угадать.
		int targetNumber = (int) (Math.random() * 100);
		
		while (true) {
			System.out.println("Число которое нужно угатать," + targetNumber);

//		Вызываем метод лля каждог игрока
			p1.guess();
			p2.guess();
			p3.guess();
//		Извлекаем варианты каждого игрока( результаты работы их методов gues()) получая доступ к их переменным Number
			guessp1 = p1.number;
			System.out.println("Первый игрок думает, что это " + guessp1);

			guessp2 = p2.number;
			System.out.println("Второй игрок думает, что это " + guessp2);

			guessp3 = p3.number;
			System.out.println("Третий игрок думает, что это " + guessp3);

//			Проверяем варианты для каждого из игроков на соответсвие заданному числу. 
//			Если игрок угадал то присваивавем соответствующей переменной значение true
			if (guessp1 == targetNumber) {
				p1isRight = true;
			}
			if (guessp2 == targetNumber) {
				p2isRight = true;
			}
			if (guessp3 == targetNumber) {
				p3isRight = true;
			}
//			Если первый, ИЛИ второй, ИЛИ третий игроки угадали
			if (p1isRight || p2isRight || p3isRight) {
				System.out.println("У нас есть победитель!");
				System.out.println("Первый игрок угадал?" + p1isRight);
				System.out.println("Второй игрок угадал?" + p2isRight);
				System.out.println("Третий игрок угадал?" + p3isRight);
				System.out.println("Конец игры");
				break;// Игра окончена, так что цикл прерывается
			} // Иначе остаемся в цикле и просим игроков попробыватьб еще раз
			else {
//				Мы должны продолжать так как никто не угадал число
				System.out.println("Игроки должны попробывать еще раз");
			} // конец if/else

		} // конец цикла

	}// конец метода
}// конец класса
