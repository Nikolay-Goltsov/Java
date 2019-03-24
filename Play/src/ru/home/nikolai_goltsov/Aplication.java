package ru.home.nikolai_goltsov;

public class Aplication {
	private CreditCalculator calculator;
	
	public void init() {
		calculator = new CreditCalculator();
    }

    public void run() {
    	calculator.setAmount(10000);
        calculator.setYears(48);
        calculator.PercentS(10);
        calculator.calculate();
        System.out.println("Месячный платеж: " + calculator.getMonthlyPayment());
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aplication aplication = new Aplication();
		aplication.init();
		aplication.run();
	}

}
