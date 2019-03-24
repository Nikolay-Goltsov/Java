
 class DrumKit {
	boolean topHat = true;
	boolean snare = true;

	void playShane() {
		System.out.println("bah-bah-bah");
	}

	void playTopHat() {
		System.out.println("Din-din-din");
	}
}

class DrumKitTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DrumKit d = new DrumKit();
		d.playShane();// Вызов метода 
		d.snare = false;// Передача значения false. После проверки метод не вызовится
		d.playTopHat();// Вызов второго метода
			
		// Проверка метода
		if (d.snare == true) {
			d.playShane();
		}
		
	}

}
