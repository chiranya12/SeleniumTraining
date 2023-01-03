package assignment3;

public class Employee {
	public int employeeLevel;
	public double basicPay;
	public double boa;
	public double bonus;
	public boolean isNewTaxRate = true;

	public double pfRate = 0.12;
	public double pf;

	public double monthlyGross;
	public double yearlyGross;
	public double monthlyTax;
	public double yearlyTax;
	public double MonthlyTakeHomeSalary;

	public double oldTaxRate;
	public double newTaxRate;
	public double MonthlytakeHomeSalary;

	public double caluculatePF() {
		pf = basicPay * pfRate;
		return pf;
	}

	public double caluculateMonthlyGross() {
		monthlyGross = basicPay + boa + bonus - pf;
		return monthlyGross;
	}

	public double caluculateYearlyGross() {
		yearlyGross = monthlyGross * 12;

		return yearlyGross;
	}

	public double caluculateYearlyTax() {

		if (isNewTaxRate)
			yearlyTax = yearlyGross * newTaxRate;
		else
			yearlyTax = yearlyGross * oldTaxRate;

		return yearlyTax;
	}

	public double caluculateMonthlyTax() {
		monthlyTax = yearlyTax / 12;
		return monthlyTax;
	}

	public double caluculateMonthlyTakeHome() {

		MonthlyTakeHomeSalary = monthlyGross - monthlyTax;
		return MonthlyTakeHomeSalary;
	}

	public int calculateTaxRate() {
		if (yearlyGross <= 250000) {
			oldTaxRate = 0;
			newTaxRate = 0;
		}
		if (yearlyGross > 250000 && yearlyGross <= 500000) {
			oldTaxRate = 0.05;
			newTaxRate = 0.05;
		}

		if (yearlyGross > 500000 && yearlyGross <= 750000) {
			oldTaxRate = 0.20;
			newTaxRate = 0.10;
		}

		if (yearlyGross > 750000 && yearlyGross <= 1000000) {
			oldTaxRate = 0.20;
			newTaxRate = 0.15;
		}
		if (yearlyGross > 1000000 && yearlyGross <= 1250000) {
			oldTaxRate = 0.30;
			newTaxRate = 0.20;
		}
		if (yearlyGross > 1250000 && yearlyGross <= 1500000) {
			oldTaxRate = 0.30;
			newTaxRate = 0.25;
		}
		if (yearlyGross > 1500000) {
			oldTaxRate = 0.30;
			newTaxRate = 0.30;
		}
		return 0;
	}

}
