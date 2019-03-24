package ru.home.nikolai_goltsov;

public class CreditCalculator {

	int setAmour;
	int setYears;
	double setPercentS;

	public void setAmount(int i) {
		// TODO Auto-generated method stub
		System.out.println("Сумма кредита равна " + i);
		setAmour = i;
	}

	public int setYears(int x) {
		// TODO Auto-generated method stub
		System.out.println("Кредит выдан на " + x + " мес.");
//		if (x<12) {
			x=12;
//		}if (x>12) {
//			x=x;
//		} else {
//
//		}
		
		return setYears = x / 12;

	}

	public double PercentS(double z) {
		System.out.println("Процентная ставка " + z + "% годовых");
		setPercentS = (z * setAmour / 100) * 12;
		System.out.println("Сумма процентов состовляет " + setPercentS);
		return setPercentS;
	}

	public double calculate() {
		// TODO Auto-generated method stub
		return (((setPercentS * setYears) + setAmour) / (setYears * 12));

	}

	public String getMonthlyPayment() {
		// TODO Auto-generated method stub

		return Double.toString(calculate());
	}

}
