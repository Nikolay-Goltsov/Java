public class While_lop {

	public static void main(String[] args) {
		//Создание переменных типа long
		long st, sp, z;
		// инициализация и присвоение с вызовом метода
		st = System.nanoTime();
		
		// инициализация
		long x = 0;
		// проверка условия (Чему равен Х)
		while (x < 1999999999) {
			// второе условие
//			if (x % 1000 == 0) {
			// вывод в консоль
				System.out.println("x = " + x);
//			}
			x++;
		}

		sp = System.nanoTime();
		z = (sp - st) / 1000000000 ;

		System.out.println("While running time was:" + z);
		
		
		
	
		
	}

}
